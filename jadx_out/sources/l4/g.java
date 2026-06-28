package l4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes4.dex */
public @interface g {
    String name();

    String referencedName();
}
