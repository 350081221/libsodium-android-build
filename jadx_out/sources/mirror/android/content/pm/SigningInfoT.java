package mirror.android.content.pm;

import android.content.pm.PackageParser;
import android.content.pm.Signature;
import android.util.ArraySet;
import com.lody.virtual.helper.utils.Reflect;
import java.lang.reflect.Constructor;
import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefConstructor;

/* loaded from: classes4.dex */
public class SigningInfoT {
    public static Class<?> TYPE = RefClass.load((Class<?>) SigningInfo.class, "android.content.pm.SigningInfo");

    @MethodReflectParams({"android.content.pm.SigningDetails"})
    public static RefConstructor<Object> ctor;

    public static Object createSigningInfo(PackageParser.SigningDetails signingDetails) {
        try {
            Object newInstance = Class.forName("android.content.pm.SigningDetails").getDeclaredConstructor(new Signature[0].getClass(), Integer.TYPE, new ArraySet().getClass(), new Signature[0].getClass()).newInstance(Reflect.on(signingDetails).field("signatures").get(), Reflect.on(signingDetails).field("signatureSchemeVersion").get(), Reflect.on(signingDetails).field("publicKeys").get(), Reflect.on(signingDetails).field("pastSigningCertificates").get());
            for (Constructor<?> constructor : Class.forName("android.content.pm.SigningInfo").getDeclaredConstructors()) {
                if (constructor.toString().contains("SigningDetails")) {
                    return constructor.newInstance(newInstance);
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
