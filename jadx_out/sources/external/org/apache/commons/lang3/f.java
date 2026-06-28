package external.org.apache.commons.lang3;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15965a = new a();

    /* loaded from: classes3.dex */
    public static class a implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        a() {
        }

        private Object readResolve() {
            return f.f15965a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(T t5) {
        if (t5 instanceof Cloneable) {
            if (t5.getClass().isArray()) {
                Class<?> componentType = t5.getClass().getComponentType();
                if (!componentType.isPrimitive()) {
                    return (T) ((Object[]) t5).clone();
                }
                int length = Array.getLength(t5);
                T t6 = (T) Array.newInstance(componentType, length);
                while (true) {
                    int i5 = length - 1;
                    if (length > 0) {
                        Array.set(t6, i5, Array.get(t5, i5));
                        length = i5;
                    } else {
                        return t6;
                    }
                }
            } else {
                try {
                    return (T) t5.getClass().getMethod("clone", new Class[0]).invoke(t5, new Object[0]);
                } catch (IllegalAccessException e5) {
                    throw new i3.a("Cannot clone Cloneable type " + t5.getClass().getName(), e5);
                } catch (NoSuchMethodException e6) {
                    throw new i3.a("Cloneable type " + t5.getClass().getName() + " has no clone method", e6);
                } catch (InvocationTargetException e7) {
                    throw new i3.a("Exception cloning Cloneable type " + t5.getClass().getName(), e7.getCause());
                }
            }
        } else {
            return null;
        }
    }

    public static <T> T b(T t5) {
        T t6 = (T) a(t5);
        return t6 == null ? t5 : t6;
    }

    public static <T extends Comparable<? super T>> int c(T t5, T t6) {
        return d(t5, t6, false);
    }

    public static <T extends Comparable<? super T>> int d(T t5, T t6, boolean z4) {
        if (t5 == t6) {
            return 0;
        }
        return t5 == null ? z4 ? 1 : -1 : t6 == null ? z4 ? -1 : 1 : t5.compareTo(t6);
    }

    public static <T> T e(T t5, T t6) {
        return t5 != null ? t5 : t6;
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static <T> T g(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t5 : tArr) {
            if (t5 != null) {
                return t5;
            }
        }
        return null;
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int i(Object... objArr) {
        int i5 = 1;
        if (objArr != null) {
            for (Object obj : objArr) {
                i5 = (i5 * 31) + h(obj);
            }
        }
        return i5;
    }

    public static String j(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        k(stringBuffer, obj);
        return stringBuffer.toString();
    }

    public static void k(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            stringBuffer.append(obj.getClass().getName());
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
        throw new NullPointerException("Cannot get the toString of a null identity");
    }

    public static <T extends Comparable<? super T>> T l(T... tArr) {
        T t5 = null;
        if (tArr != null) {
            for (T t6 : tArr) {
                if (d(t6, t5, false) > 0) {
                    t5 = t6;
                }
            }
        }
        return t5;
    }

    public static <T extends Comparable<? super T>> T m(T... tArr) {
        i.A(tArr);
        i.q(tArr);
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    public static <T> T n(Comparator<T> comparator, T... tArr) {
        i.B(tArr, "null/empty items", new Object[0]);
        i.q(tArr);
        i.D(comparator, "null comparator", new Object[0]);
        TreeSet treeSet = new TreeSet(comparator);
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    public static <T extends Comparable<? super T>> T o(T... tArr) {
        T t5 = null;
        if (tArr != null) {
            for (T t6 : tArr) {
                if (d(t6, t5, true) < 0) {
                    t5 = t6;
                }
            }
        }
        return t5;
    }

    public static <T> T p(T... tArr) {
        if (!external.org.apache.commons.lang3.a.J0(tArr)) {
            return null;
        }
        HashMap hashMap = new HashMap(tArr.length);
        int i5 = 0;
        for (T t5 : tArr) {
            j3.b bVar = (j3.b) hashMap.get(t5);
            if (bVar == null) {
                hashMap.put(t5, new j3.b(1));
            } else {
                bVar.increment();
            }
        }
        while (true) {
            T t6 = null;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((j3.b) entry.getValue()).intValue();
                if (intValue == i5) {
                    break;
                }
                if (intValue > i5) {
                    t6 = (T) entry.getKey();
                    i5 = intValue;
                }
            }
            return t6;
        }
    }

    public static boolean q(Object obj, Object obj2) {
        return !f(obj, obj2);
    }

    public static String r(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public static String s(Object obj, String str) {
        return obj == null ? str : obj.toString();
    }
}
