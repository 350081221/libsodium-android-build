package u3;

import com.swift.sandhook.annotation.MethodReflectParams;
import com.uc.crashsdk.export.LogType;
import java.lang.annotation.Annotation;
import kotlin.b1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;

@i0(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001f\u0010\u001f\u001a\u00020 \"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0014*\u0006\u0012\u0002\b\u00030!¢\u0006\u0002\u0010\"\"'\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\";\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\b\u0012\u0004\u0012\u0002H\b0\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"-\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00018G¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\u0002H\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015\";\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"+\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012\"-\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012\"+\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"annotationClass", "Lkotlin/reflect/KClass;", "T", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "declaringJavaClass", "Ljava/lang/Class;", "E", "", "getDeclaringJavaClass$annotations", "(Ljava/lang/Enum;)V", "getDeclaringJavaClass", "(Ljava/lang/Enum;)Ljava/lang/Class;", LogType.JAVA_TYPE, "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaClass", "", "(Ljava/lang/Object;)Ljava/lang/Class;", "getRuntimeClassOfKClassInstance$annotations", "getRuntimeClassOfKClassInstance", "javaObjectType", "getJavaObjectType", "javaPrimitiveType", "getJavaPrimitiveType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@h(name = "JvmClassMappingKt")
/* loaded from: classes4.dex */
public final class a {
    @p4.l
    public static final <T extends Annotation> kotlin.reflect.d<? extends T> a(@p4.l T t5) {
        l0.p(t5, "<this>");
        Class<? extends Annotation> annotationType = t5.annotationType();
        l0.o(annotationType, "this as java.lang.annota…otation).annotationType()");
        kotlin.reflect.d<? extends T> i5 = i(annotationType);
        l0.n(i5, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return i5;
    }

    private static final <E extends Enum<E>> Class<E> b(Enum<E> r12) {
        l0.p(r12, "<this>");
        Class<E> declaringClass = r12.getDeclaringClass();
        l0.o(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    @g1(version = "1.7")
    @kotlin.internal.f
    public static /* synthetic */ void c(Enum r02) {
    }

    @p4.l
    public static final <T> Class<T> d(@p4.l T t5) {
        l0.p(t5, "<this>");
        Class<T> cls = (Class<T>) t5.getClass();
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    @p4.l
    @h(name = "getJavaClass")
    public static final <T> Class<T> e(@p4.l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.t) dVar).p();
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    public static /* synthetic */ void f(kotlin.reflect.d dVar) {
    }

    @p4.l
    public static final <T> Class<T> g(@p4.l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.t) dVar).p();
        if (!cls.isPrimitive()) {
            l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(MethodReflectParams.DOUBLE)) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals(MethodReflectParams.INT)) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals(MethodReflectParams.BYTE)) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals(MethodReflectParams.CHAR)) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals(MethodReflectParams.LONG)) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals(MethodReflectParams.SHORT)) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @p4.m
    public static final <T> Class<T> h(@p4.l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.t) dVar).p();
        if (cls.isPrimitive()) {
            l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @p4.l
    @h(name = "getKotlinClass")
    public static final <T> kotlin.reflect.d<T> i(@p4.l Class<T> cls) {
        l0.p(cls, "<this>");
        return l1.d(cls);
    }

    @p4.l
    @h(name = "getRuntimeClassOfKClassInstance")
    public static final <T> Class<kotlin.reflect.d<T>> j(@p4.l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<kotlin.reflect.d<T>> cls = (Class<kotlin.reflect.d<T>>) dVar.getClass();
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @b1(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(kotlin.reflect.d dVar) {
    }

    public static final /* synthetic */ boolean l(Object[] objArr) {
        l0.p(objArr, "<this>");
        l0.y(4, "T");
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
