package pl.bartlomieja.projekt.warstwa;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

public class Describe {


    boolean ignoreCollections;
    boolean ignoreArrays;
    boolean ignoreType;

    public Describe(boolean ignoreCollections, boolean ignoreArrays, boolean ignoreType) {
        this.ignoreArrays = ignoreArrays;
        this.ignoreCollections = ignoreCollections;
        this.ignoreType = ignoreType;
    }

    public Describe() {
        this.ignoreArrays = false;
        this.ignoreCollections = false;
        this.ignoreType = false;
    }

    String describeInner(Object o, StringBuilder sb) {

        if (o instanceof Collection) {
            if (!ignoreCollections) {
                sb.append(" [ ");

                for (Object i : (Collection) o) {
                    describeInner(i, sb);
                    sb.append(" , ");
                }

                sb.replace(sb.length() - 2, sb.length(), "");
                sb.append("] ");
            }

            else {
                sb.append("ignored collection");
            }
        }

        else if (o instanceof Map) {
            if (!ignoreCollections) {
                sb.append(" [");

                for (Object i : ((Map) o).entrySet()) {
                    if (i instanceof Map.Entry) {
                        describeInner(((Map.Entry) i).getKey(), sb);
                        sb.append(" : ");
                        describeInner(((Map.Entry) i).getValue(), sb);
                        sb.append(", ");
                    }


                }

                sb.replace(sb.length() - 2, sb.length(), "");
                sb.append("] ");
            } else {
                sb.append("ignored collection");
            }
        }

        else if (o.getClass().isArray()) {
            if (!ignoreArrays) {
                sb.append(" [");

                for (Object i : (Object[]) o) {
                    describeInner(i, sb);
                    sb.append(", ");
                }

                sb.replace(sb.length() - 2, sb.length(), "");
                sb.append("] ");
            } else {
                sb.append("ignored arrays");
            }
        }

        else if (o instanceof Number || o instanceof Character
                || o instanceof Boolean || o instanceof String) {
            sb.append(o);
        }

        else {
            sb.append(reflect(o));
        }

        return null;
    }

    private String reflect(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        StringBuilder s = new StringBuilder();
        s.append("Object{");

        for (Field f : fields) {
            s.append(f.getName());
            s.append("=(");

            try {
                f.setAccessible(true);
                if (!ignoreType) {
                    String type = f.getGenericType().toString();
                    s.append(type);
                    s.append(", ");
                }
                Object value = f.get(o);

                describeInner(value, s);
                s.append(")");
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }

            s.append(", ");
        }
        s.replace(s.length() - 2, s.length(), "");
        s.append("} ");
        return s.toString();
    }

    public String describe(Object o) {
        if (o != null) {
            StringBuilder sb = new StringBuilder();
            describeInner(o, sb);
            return sb.toString();
        }
        return null;
    }
}
