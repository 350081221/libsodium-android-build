package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.i0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0000R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/LayerPositionalProperties;", "", "other", "Lkotlin/r2;", "copyFrom", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "scope", "", "hasSameValuesAs", "", "scaleX", "F", "scaleY", "translationX", "translationY", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "J", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayerPositionalProperties {
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.Companion.m4123getCenterSzJe1aQ();

    public final void copyFrom(@l LayerPositionalProperties layerPositionalProperties) {
        this.scaleX = layerPositionalProperties.scaleX;
        this.scaleY = layerPositionalProperties.scaleY;
        this.translationX = layerPositionalProperties.translationX;
        this.translationY = layerPositionalProperties.translationY;
        this.rotationX = layerPositionalProperties.rotationX;
        this.rotationY = layerPositionalProperties.rotationY;
        this.rotationZ = layerPositionalProperties.rotationZ;
        this.cameraDistance = layerPositionalProperties.cameraDistance;
        this.transformOrigin = layerPositionalProperties.transformOrigin;
    }

    public final boolean hasSameValuesAs(@l LayerPositionalProperties layerPositionalProperties) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.scaleX == layerPositionalProperties.scaleX) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.scaleY == layerPositionalProperties.scaleY) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (this.translationX == layerPositionalProperties.translationX) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (this.translationY == layerPositionalProperties.translationY) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (this.rotationX == layerPositionalProperties.rotationX) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            if (this.rotationY == layerPositionalProperties.rotationY) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                if (this.rotationZ == layerPositionalProperties.rotationZ) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    if (this.cameraDistance == layerPositionalProperties.cameraDistance) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 && TransformOrigin.m4117equalsimpl0(this.transformOrigin, layerPositionalProperties.transformOrigin)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void copyFrom(@l GraphicsLayerScope graphicsLayerScope) {
        this.scaleX = graphicsLayerScope.getScaleX();
        this.scaleY = graphicsLayerScope.getScaleY();
        this.translationX = graphicsLayerScope.getTranslationX();
        this.translationY = graphicsLayerScope.getTranslationY();
        this.rotationX = graphicsLayerScope.getRotationX();
        this.rotationY = graphicsLayerScope.getRotationY();
        this.rotationZ = graphicsLayerScope.getRotationZ();
        this.cameraDistance = graphicsLayerScope.getCameraDistance();
        this.transformOrigin = graphicsLayerScope.mo3922getTransformOriginSzJe1aQ();
    }
}
