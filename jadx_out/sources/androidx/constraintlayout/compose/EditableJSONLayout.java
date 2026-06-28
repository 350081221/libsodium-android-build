package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Registry;
import androidx.constraintlayout.core.state.RegistryCallback;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.intellij.lang.annotations.d;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\b\u001a\u00020\u0002H\u0004J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tJ\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0006\u0010\u0017\u001a\u00020\tJ\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014J\u0016\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0012H\u0004J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0012H\u0004R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/¨\u00066"}, d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "Lkotlin/r2;", "initialization", "Landroidx/compose/runtime/MutableState;", "", "needsUpdate", "setUpdateFlag", "signalUpdate", "", "content", "setCurrentContent", "getCurrentContent", "name", "setDebugName", "getDebugName", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getForcedDrawDebug", "", "getForcedWidth", "getForcedHeight", "information", "setLayoutInformation", "getLayoutInformation", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "getLayoutInformationMode", "onNewContent", "", "progress", "onNewProgress", "width", "height", "onNewDimensions", "mode", "onLayoutInformation", "debugMode", "onDrawDebug", "forcedWidth", "I", "forcedHeight", "forcedDrawDebug", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "updateFlag", "Landroidx/compose/runtime/MutableState;", "layoutInformationMode", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "layoutInformation", "Ljava/lang/String;", "last", "J", "debugName", "currentContent", "<init>", "(Ljava/lang/String;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
@a1
/* loaded from: classes2.dex */
public abstract class EditableJSONLayout implements LayoutInformationReceiver {

    @l
    private String currentContent;

    @m
    private String debugName;

    @l
    private MotionLayoutDebugFlags forcedDrawDebug;
    private int forcedHeight;
    private int forcedWidth;
    private long last;

    @l
    private String layoutInformation;

    @l
    private LayoutInfoFlags layoutInformationMode;

    @m
    private MutableState<Long> updateFlag;

    public EditableJSONLayout(@l @d("json5") String content) {
        l0.p(content, "content");
        this.forcedWidth = Integer.MIN_VALUE;
        this.forcedHeight = Integer.MIN_VALUE;
        this.forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
        this.layoutInformationMode = LayoutInfoFlags.NONE;
        this.layoutInformation = "";
        this.last = System.nanoTime();
        this.currentContent = content;
    }

    @l
    public final String getCurrentContent() {
        return this.currentContent;
    }

    @m
    public final String getDebugName() {
        return this.debugName;
    }

    @l
    public final MotionLayoutDebugFlags getForcedDrawDebug() {
        return this.forcedDrawDebug;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedHeight() {
        return this.forcedHeight;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedWidth() {
        return this.forcedWidth;
    }

    @l
    public final String getLayoutInformation() {
        return this.layoutInformation;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    @l
    public LayoutInfoFlags getLayoutInformationMode() {
        return this.layoutInformationMode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void initialization() {
        try {
            onNewContent(this.currentContent);
            if (this.debugName != null) {
                Registry.getInstance().register(this.debugName, new RegistryCallback() { // from class: androidx.constraintlayout.compose.EditableJSONLayout$initialization$callback$1
                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    @l
                    public String currentLayoutInformation() {
                        String str;
                        str = EditableJSONLayout.this.layoutInformation;
                        return str;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    @l
                    public String currentMotionScene() {
                        String str;
                        str = EditableJSONLayout.this.currentContent;
                        return str;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public long getLastModified() {
                        long j5;
                        j5 = EditableJSONLayout.this.last;
                        return j5;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onDimensions(int i5, int i6) {
                        EditableJSONLayout.this.onNewDimensions(i5, i6);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onNewMotionScene(@m String str) {
                        if (str == null) {
                            return;
                        }
                        EditableJSONLayout.this.onNewContent(str);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onProgress(float f5) {
                        EditableJSONLayout.this.onNewProgress(f5);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setDrawDebug(int i5) {
                        EditableJSONLayout.this.onDrawDebug(i5);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setLayoutInformationMode(int i5) {
                        EditableJSONLayout.this.onLayoutInformation(i5);
                    }
                });
            }
        } catch (CLParsingException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onDrawDebug(int i5) {
        if (i5 == -1) {
            this.forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
        } else {
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.UNKNOWN;
            if (i5 == motionLayoutDebugFlags.ordinal()) {
                this.forcedDrawDebug = motionLayoutDebugFlags;
            } else {
                MotionLayoutDebugFlags motionLayoutDebugFlags2 = MotionLayoutDebugFlags.NONE;
                if (i5 == motionLayoutDebugFlags2.ordinal()) {
                    this.forcedDrawDebug = motionLayoutDebugFlags2;
                } else {
                    MotionLayoutDebugFlags motionLayoutDebugFlags3 = MotionLayoutDebugFlags.SHOW_ALL;
                    if (i5 == motionLayoutDebugFlags3.ordinal()) {
                        this.forcedDrawDebug = motionLayoutDebugFlags3;
                    }
                }
            }
        }
        signalUpdate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onLayoutInformation(int i5) {
        LayoutInfoFlags layoutInfoFlags = LayoutInfoFlags.NONE;
        if (i5 == layoutInfoFlags.ordinal()) {
            this.layoutInformationMode = layoutInfoFlags;
        } else {
            LayoutInfoFlags layoutInfoFlags2 = LayoutInfoFlags.BOUNDS;
            if (i5 == layoutInfoFlags2.ordinal()) {
                this.layoutInformationMode = layoutInfoFlags2;
            }
        }
        signalUpdate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNewContent(@l String content) {
        boolean z4;
        CLObject objectOrNull;
        l0.p(content, "content");
        this.currentContent = content;
        try {
            CLObject parse = CLParser.parse(content);
            if (parse != null) {
                if (this.debugName == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (objectOrNull = parse.getObjectOrNull("Header")) != null) {
                    this.debugName = objectOrNull.getStringOrNull("exportAs");
                }
                if (!z4) {
                    signalUpdate();
                }
            }
        } catch (CLParsingException | Exception unused) {
        }
    }

    public final void onNewDimensions(int i5, int i6) {
        this.forcedWidth = i5;
        this.forcedHeight = i6;
        signalUpdate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNewProgress(float f5) {
    }

    public final void setCurrentContent(@l String content) {
        l0.p(content, "content");
        onNewContent(content);
    }

    public final void setDebugName(@m String str) {
        this.debugName = str;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setLayoutInformation(@l String information) {
        l0.p(information, "information");
        this.last = System.nanoTime();
        this.layoutInformation = information;
    }

    public final void setUpdateFlag(@l MutableState<Long> needsUpdate) {
        l0.p(needsUpdate, "needsUpdate");
        this.updateFlag = needsUpdate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void signalUpdate() {
        MutableState<Long> mutableState = this.updateFlag;
        if (mutableState != null) {
            l0.m(mutableState);
            MutableState<Long> mutableState2 = this.updateFlag;
            l0.m(mutableState2);
            mutableState.setValue(Long.valueOf(mutableState2.getValue().longValue() + 1));
        }
    }
}
