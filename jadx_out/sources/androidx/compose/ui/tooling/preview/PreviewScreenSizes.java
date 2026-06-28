package androidx.compose.ui.tooling.preview;

import androidx.compose.ui.tooling.preview.Preview;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i0;
import n3.a;
import n3.b;
import n3.e;
import n3.f;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@e(a.BINARY)
@Preview.Container({@Preview(device = Devices.PHONE, name = "Phone", showSystemUi = true), @Preview(device = "spec:width = 411dp, height = 891dp, orientation = landscape, dpi = 420", name = "Phone - Landscape", showSystemUi = true), @Preview(device = Devices.FOLDABLE, name = "Unfolded Foldable", showSystemUi = true), @Preview(device = Devices.TABLET, name = "Tablet", showSystemUi = true), @Preview(device = Devices.DESKTOP, name = "Desktop", showSystemUi = true)})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/preview/PreviewScreenSizes;", "", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f(allowedTargets = {b.ANNOTATION_CLASS, b.FUNCTION})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface PreviewScreenSizes {
}
