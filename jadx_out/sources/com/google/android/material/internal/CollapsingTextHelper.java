package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final String ELLIPSIS_NORMAL = "…";
    private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    private static final String TAG = "CollapsingTextHelper";
    private boolean boundsChanged;

    @NonNull
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private ColorStateList collapsedTextColor;
    private float collapsedTextWidth;
    private Typeface collapsedTypeface;
    private Typeface collapsedTypefaceBold;
    private Typeface collapsedTypefaceDefault;

    @NonNull
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentLetterSpacing;
    private int currentOffsetY;
    private int currentShadowColor;
    private float currentShadowDx;
    private float currentShadowDy;
    private float currentShadowRadius;
    private float currentTextSize;
    private Typeface currentTypeface;

    @NonNull
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private int expandedLineCount;
    private ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private ColorStateList expandedTextColor;

    @Nullable
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private Typeface expandedTypefaceBold;
    private Typeface expandedTypefaceDefault;
    private boolean fadeModeEnabled;
    private float fadeModeStartFraction;
    private float fadeModeThresholdFraction;
    private boolean isRtl;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;

    @Nullable
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;

    @Nullable
    private CharSequence text;
    private StaticLayout textLayout;

    @NonNull
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;

    @Nullable
    private CharSequence textToDraw;
    private CharSequence textToDrawCollapsed;
    private Paint texturePaint;

    @NonNull
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;
    private static final boolean USE_SCALING_TEXTURE = false;

    @NonNull
    private static final Paint DEBUG_DRAW_PAINT = null;
    private int expandedTextGravity = 16;
    private int collapsedTextGravity = 16;
    private float expandedTextSize = 15.0f;
    private float collapsedTextSize = 15.0f;
    private TextUtils.TruncateAt titleTextEllipsize = TextUtils.TruncateAt.END;
    private boolean isRtlTextDirectionHeuristicsEnabled = true;
    private int maxLines = 1;
    private float lineSpacingAdd = 0.0f;
    private float lineSpacingMultiplier = 1.0f;
    private int hyphenationFrequency = StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY;

    public CollapsingTextHelper(View view) {
        this.view = view;
        TextPaint textPaint = new TextPaint(129);
        this.textPaint = textPaint;
        this.tmpPaint = new TextPaint(textPaint);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    @ColorInt
    private static int blendARGB(@ColorInt int i5, @ColorInt int i6, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        float f6 = 1.0f - f5;
        return Color.argb(Math.round((Color.alpha(i5) * f6) + (Color.alpha(i6) * f5)), Math.round((Color.red(i5) * f6) + (Color.red(i6) * f5)), Math.round((Color.green(i5) * f6) + (Color.green(i6) * f5)), Math.round((Color.blue(i5) * f6) + (Color.blue(i6) * f5)));
    }

    private void calculateBaseOffsets(boolean z4) {
        float f5;
        int i5;
        StaticLayout staticLayout;
        calculateUsingTextSize(1.0f, z4);
        CharSequence charSequence = this.textToDraw;
        if (charSequence != null && (staticLayout = this.textLayout) != null) {
            this.textToDrawCollapsed = TextUtils.ellipsize(charSequence, this.textPaint, staticLayout.getWidth(), this.titleTextEllipsize);
        }
        CharSequence charSequence2 = this.textToDrawCollapsed;
        float f6 = 0.0f;
        if (charSequence2 != null) {
            this.collapsedTextWidth = measureTextWidth(this.textPaint, charSequence2);
        } else {
            this.collapsedTextWidth = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.collapsedTextGravity, this.isRtl ? 1 : 0);
        int i6 = absoluteGravity & 112;
        if (i6 != 48) {
            if (i6 != 80) {
                this.collapsedDrawY = this.collapsedBounds.centerY() - ((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f);
            } else {
                this.collapsedDrawY = this.collapsedBounds.bottom + this.textPaint.ascent();
            }
        } else {
            this.collapsedDrawY = this.collapsedBounds.top;
        }
        int i7 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i7 != 1) {
            if (i7 != 5) {
                this.collapsedDrawX = this.collapsedBounds.left;
            } else {
                this.collapsedDrawX = this.collapsedBounds.right - this.collapsedTextWidth;
            }
        } else {
            this.collapsedDrawX = this.collapsedBounds.centerX() - (this.collapsedTextWidth / 2.0f);
        }
        calculateUsingTextSize(0.0f, z4);
        StaticLayout staticLayout2 = this.textLayout;
        if (staticLayout2 != null) {
            f5 = staticLayout2.getHeight();
        } else {
            f5 = 0.0f;
        }
        StaticLayout staticLayout3 = this.textLayout;
        if (staticLayout3 != null && this.maxLines > 1) {
            f6 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.textToDraw;
            if (charSequence3 != null) {
                f6 = measureTextWidth(this.textPaint, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.textLayout;
        if (staticLayout4 != null) {
            i5 = staticLayout4.getLineCount();
        } else {
            i5 = 0;
        }
        this.expandedLineCount = i5;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0);
        int i8 = absoluteGravity2 & 112;
        if (i8 != 48) {
            if (i8 != 80) {
                this.expandedDrawY = this.expandedBounds.centerY() - (f5 / 2.0f);
            } else {
                this.expandedDrawY = (this.expandedBounds.bottom - f5) + this.textPaint.descent();
            }
        } else {
            this.expandedDrawY = this.expandedBounds.top;
        }
        int i9 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i9 != 1) {
            if (i9 != 5) {
                this.expandedDrawX = this.expandedBounds.left;
            } else {
                this.expandedDrawX = this.expandedBounds.right - f6;
            }
        } else {
            this.expandedDrawX = this.expandedBounds.centerX() - (f6 / 2.0f);
        }
        clearTexture();
        setInterpolatedTextSize(this.expandedFraction);
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.expandedFraction);
    }

    private float calculateFadeModeTextAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        float f6 = this.fadeModeThresholdFraction;
        if (f5 <= f6) {
            return AnimationUtils.lerp(1.0f, 0.0f, this.fadeModeStartFraction, f6, f5);
        }
        return AnimationUtils.lerp(0.0f, 1.0f, f6, 1.0f, f5);
    }

    private float calculateFadeModeThresholdFraction() {
        float f5 = this.fadeModeStartFraction;
        return f5 + ((1.0f - f5) * 0.5f);
    }

    private boolean calculateIsRtl(@NonNull CharSequence charSequence) {
        boolean isDefaultIsRtl = isDefaultIsRtl();
        if (this.isRtlTextDirectionHeuristicsEnabled) {
            return isTextDirectionHeuristicsIsRtl(charSequence, isDefaultIsRtl);
        }
        return isDefaultIsRtl;
    }

    private void calculateOffsets(float f5) {
        float f6;
        interpolateBounds(f5);
        if (this.fadeModeEnabled) {
            if (f5 < this.fadeModeThresholdFraction) {
                this.currentDrawX = this.expandedDrawX;
                this.currentDrawY = this.expandedDrawY;
                setInterpolatedTextSize(0.0f);
                f6 = 0.0f;
            } else {
                this.currentDrawX = this.collapsedDrawX;
                this.currentDrawY = this.collapsedDrawY - Math.max(0, this.currentOffsetY);
                setInterpolatedTextSize(1.0f);
                f6 = 1.0f;
            }
        } else {
            this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, f5, this.positionInterpolator);
            this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, f5, this.positionInterpolator);
            setInterpolatedTextSize(f5);
            f6 = f5;
        }
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        setCollapsedTextBlend(1.0f - lerp(0.0f, 1.0f, 1.0f - f5, timeInterpolator));
        setExpandedTextBlend(lerp(1.0f, 0.0f, f5, timeInterpolator));
        if (this.collapsedTextColor != this.expandedTextColor) {
            this.textPaint.setColor(blendARGB(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f6));
        } else {
            this.textPaint.setColor(getCurrentCollapsedTextColor());
        }
        int i5 = Build.VERSION.SDK_INT;
        float f7 = this.collapsedLetterSpacing;
        float f8 = this.expandedLetterSpacing;
        if (f7 != f8) {
            this.textPaint.setLetterSpacing(lerp(f8, f7, f5, timeInterpolator));
        } else {
            this.textPaint.setLetterSpacing(f7);
        }
        this.currentShadowRadius = lerp(this.expandedShadowRadius, this.collapsedShadowRadius, f5, null);
        this.currentShadowDx = lerp(this.expandedShadowDx, this.collapsedShadowDx, f5, null);
        this.currentShadowDy = lerp(this.expandedShadowDy, this.collapsedShadowDy, f5, null);
        int blendARGB = blendARGB(getCurrentColor(this.expandedShadowColor), getCurrentColor(this.collapsedShadowColor), f5);
        this.currentShadowColor = blendARGB;
        this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, blendARGB);
        if (this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (calculateFadeModeTextAlpha(f5) * this.textPaint.getAlpha()));
            if (i5 >= 31) {
                TextPaint textPaint = this.textPaint;
                textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
            }
        }
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private void calculateUsingTextSize(float f5) {
        calculateUsingTextSize(f5, false);
    }

    private void clearTexture() {
        Bitmap bitmap = this.expandedTitleTexture;
        if (bitmap != null) {
            bitmap.recycle();
            this.expandedTitleTexture = null;
        }
    }

    private StaticLayout createStaticLayout(int i5, float f5, boolean z4) {
        StaticLayout staticLayout;
        Layout.Alignment multilineTextLayoutAlignment;
        try {
            if (i5 == 1) {
                multilineTextLayoutAlignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                multilineTextLayoutAlignment = getMultilineTextLayoutAlignment();
            }
            staticLayout = StaticLayoutBuilderCompat.obtain(this.text, this.textPaint, (int) f5).setEllipsize(this.titleTextEllipsize).setIsRtl(z4).setAlignment(multilineTextLayoutAlignment).setIncludePad(false).setMaxLines(i5).setLineSpacing(this.lineSpacingAdd, this.lineSpacingMultiplier).setHyphenationFrequency(this.hyphenationFrequency).setStaticLayoutBuilderConfigurer(this.staticLayoutBuilderConfigurer).build();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e5) {
            Log.e(TAG, e5.getCause().getMessage(), e5);
            staticLayout = null;
        }
        return (StaticLayout) Preconditions.checkNotNull(staticLayout);
    }

    private void drawMultilineTransition(@NonNull Canvas canvas, float f5, float f6) {
        int alpha = this.textPaint.getAlpha();
        canvas.translate(f5, f6);
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.expandedTextBlend * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.textPaint;
                textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
            }
            this.textLayout.draw(canvas);
        }
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.collapsedTextBlend * alpha));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            TextPaint textPaint2 = this.textPaint;
            textPaint2.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint2.getAlpha()));
        }
        int lineBaseline = this.textLayout.getLineBaseline(0);
        CharSequence charSequence = this.textToDrawCollapsed;
        float f7 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f7, this.textPaint);
        if (i5 >= 31) {
            this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, this.currentShadowColor);
        }
        if (!this.fadeModeEnabled) {
            String trim = this.textToDrawCollapsed.toString().trim();
            if (trim.endsWith(ELLIPSIS_NORMAL)) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.textPaint.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.textLayout.getLineEnd(0), str.length()), 0.0f, f7, (Paint) this.textPaint);
        }
    }

    private void ensureExpandedTexture() {
        if (this.expandedTitleTexture == null && !this.expandedBounds.isEmpty() && !TextUtils.isEmpty(this.textToDraw)) {
            calculateOffsets(0.0f);
            int width = this.textLayout.getWidth();
            int height = this.textLayout.getHeight();
            if (width > 0 && height > 0) {
                this.expandedTitleTexture = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.textLayout.draw(new Canvas(this.expandedTitleTexture));
                if (this.texturePaint == null) {
                    this.texturePaint = new Paint(3);
                }
            }
        }
    }

    private float getCollapsedTextLeftBound(int i5, int i6) {
        if (i6 != 17 && (i6 & 7) != 1) {
            if ((i6 & GravityCompat.END) != 8388613 && (i6 & 5) != 5) {
                if (this.isRtl) {
                    return this.collapsedBounds.right - this.collapsedTextWidth;
                }
                return this.collapsedBounds.left;
            }
            if (this.isRtl) {
                return this.collapsedBounds.left;
            }
            return this.collapsedBounds.right - this.collapsedTextWidth;
        }
        return (i5 / 2.0f) - (this.collapsedTextWidth / 2.0f);
    }

    private float getCollapsedTextRightBound(@NonNull RectF rectF, int i5, int i6) {
        if (i6 != 17 && (i6 & 7) != 1) {
            if ((i6 & GravityCompat.END) != 8388613 && (i6 & 5) != 5) {
                if (this.isRtl) {
                    return this.collapsedBounds.right;
                }
                return rectF.left + this.collapsedTextWidth;
            }
            if (this.isRtl) {
                return rectF.left + this.collapsedTextWidth;
            }
            return this.collapsedBounds.right;
        }
        return (i5 / 2.0f) + (this.collapsedTextWidth / 2.0f);
    }

    @ColorInt
    private int getCurrentColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.state;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    @ColorInt
    private int getCurrentExpandedTextColor() {
        return getCurrentColor(this.expandedTextColor);
    }

    private Layout.Alignment getMultilineTextLayoutAlignment() {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0) & 7;
        if (absoluteGravity != 1) {
            if (absoluteGravity != 5) {
                if (this.isRtl) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            }
            if (this.isRtl) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private void getTextPaintCollapsed(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.collapsedTextSize);
        textPaint.setTypeface(this.collapsedTypeface);
        textPaint.setLetterSpacing(this.collapsedLetterSpacing);
    }

    private void getTextPaintExpanded(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.expandedTextSize);
        textPaint.setTypeface(this.expandedTypeface);
        textPaint.setLetterSpacing(this.expandedLetterSpacing);
    }

    private void interpolateBounds(float f5) {
        Rect rect;
        if (this.fadeModeEnabled) {
            RectF rectF = this.currentBounds;
            if (f5 < this.fadeModeThresholdFraction) {
                rect = this.expandedBounds;
            } else {
                rect = this.collapsedBounds;
            }
            rectF.set(rect);
            return;
        }
        this.currentBounds.left = lerp(this.expandedBounds.left, this.collapsedBounds.left, f5, this.positionInterpolator);
        this.currentBounds.top = lerp(this.expandedDrawY, this.collapsedDrawY, f5, this.positionInterpolator);
        this.currentBounds.right = lerp(this.expandedBounds.right, this.collapsedBounds.right, f5, this.positionInterpolator);
        this.currentBounds.bottom = lerp(this.expandedBounds.bottom, this.collapsedBounds.bottom, f5, this.positionInterpolator);
    }

    private static boolean isClose(float f5, float f6) {
        return Math.abs(f5 - f6) < 1.0E-5f;
    }

    private boolean isDefaultIsRtl() {
        return ViewCompat.getLayoutDirection(this.view) == 1;
    }

    private boolean isTextDirectionHeuristicsIsRtl(@NonNull CharSequence charSequence, boolean z4) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat;
        if (z4) {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
        } else {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        return textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    private static float lerp(float f5, float f6, float f7, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f7 = timeInterpolator.getInterpolation(f7);
        }
        return AnimationUtils.lerp(f5, f6, f7);
    }

    private float measureTextWidth(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean rectEquals(@NonNull Rect rect, int i5, int i6, int i7, int i8) {
        return rect.left == i5 && rect.top == i6 && rect.right == i7 && rect.bottom == i8;
    }

    private void setCollapsedTextBlend(float f5) {
        this.collapsedTextBlend = f5;
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.collapsedTypefaceDefault != typeface) {
            this.collapsedTypefaceDefault = typeface;
            Typeface maybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
            this.collapsedTypefaceBold = maybeCopyWithFontWeightAdjustment;
            if (maybeCopyWithFontWeightAdjustment == null) {
                maybeCopyWithFontWeightAdjustment = this.collapsedTypefaceDefault;
            }
            this.collapsedTypeface = maybeCopyWithFontWeightAdjustment;
            return true;
        }
        return false;
    }

    private void setExpandedTextBlend(float f5) {
        this.expandedTextBlend = f5;
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.expandedTypefaceDefault != typeface) {
            this.expandedTypefaceDefault = typeface;
            Typeface maybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
            this.expandedTypefaceBold = maybeCopyWithFontWeightAdjustment;
            if (maybeCopyWithFontWeightAdjustment == null) {
                maybeCopyWithFontWeightAdjustment = this.expandedTypefaceDefault;
            }
            this.expandedTypeface = maybeCopyWithFontWeightAdjustment;
            return true;
        }
        return false;
    }

    private void setInterpolatedTextSize(float f5) {
        boolean z4;
        calculateUsingTextSize(f5);
        if (USE_SCALING_TEXTURE && this.scale != 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.useTexture = z4;
        if (z4) {
            ensureExpandedTexture();
        }
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private boolean shouldDrawMultiline() {
        return this.maxLines > 1 && (!this.isRtl || this.fadeModeEnabled) && !this.useTexture;
    }

    public void draw(@NonNull Canvas canvas) {
        boolean z4;
        int save = canvas.save();
        if (this.textToDraw != null && this.currentBounds.width() > 0.0f && this.currentBounds.height() > 0.0f) {
            this.textPaint.setTextSize(this.currentTextSize);
            float f5 = this.currentDrawX;
            float f6 = this.currentDrawY;
            if (this.useTexture && this.expandedTitleTexture != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            float f7 = this.scale;
            if (f7 != 1.0f && !this.fadeModeEnabled) {
                canvas.scale(f7, f7, f5, f6);
            }
            if (z4) {
                canvas.drawBitmap(this.expandedTitleTexture, f5, f6, this.texturePaint);
                canvas.restoreToCount(save);
                return;
            }
            if (shouldDrawMultiline() && (!this.fadeModeEnabled || this.expandedFraction > this.fadeModeThresholdFraction)) {
                drawMultilineTransition(canvas, this.currentDrawX - this.textLayout.getLineStart(0), f6);
            } else {
                canvas.translate(f5, f6);
                this.textLayout.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void getCollapsedTextActualBounds(@NonNull RectF rectF, int i5, int i6) {
        this.isRtl = calculateIsRtl(this.text);
        rectF.left = Math.max(getCollapsedTextLeftBound(i5, i6), this.collapsedBounds.left);
        rectF.top = this.collapsedBounds.top;
        rectF.right = Math.min(getCollapsedTextRightBound(rectF, i5, i6), this.collapsedBounds.right);
        rectF.bottom = this.collapsedBounds.top + getCollapsedTextHeight();
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public float getCollapsedTextHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.collapsedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @ColorInt
    public int getCurrentCollapsedTextColor() {
        return getCurrentColor(this.collapsedTextColor);
    }

    public int getExpandedLineCount() {
        return this.expandedLineCount;
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public float getExpandedTextFullHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return (-this.tmpPaint.ascent()) + this.tmpPaint.descent();
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public float getExpandedTextHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.expandedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.expandedFraction;
    }

    public float getFadeModeThresholdFraction() {
        return this.fadeModeThresholdFraction;
    }

    @RequiresApi(23)
    public int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi(23)
    public float getLineSpacingAdd() {
        return this.textLayout.getSpacingAdd();
    }

    @RequiresApi(23)
    public float getLineSpacingMultiplier() {
        return this.textLayout.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    @Nullable
    public TimeInterpolator getPositionInterpolator() {
        return this.positionInterpolator;
    }

    @Nullable
    public CharSequence getText() {
        return this.text;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.titleTextEllipsize;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.isRtlTextDirectionHeuristicsEnabled;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.collapsedTextColor;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.expandedTextColor) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    public void maybeUpdateFontWeightAdjustment(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.collapsedTypefaceDefault;
            if (typeface != null) {
                this.collapsedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.expandedTypefaceDefault;
            if (typeface2 != null) {
                this.expandedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.collapsedTypefaceBold;
            if (typeface3 == null) {
                typeface3 = this.collapsedTypefaceDefault;
            }
            this.collapsedTypeface = typeface3;
            Typeface typeface4 = this.expandedTypefaceBold;
            if (typeface4 == null) {
                typeface4 = this.expandedTypefaceDefault;
            }
            this.expandedTypeface = typeface4;
            recalculate(true);
        }
    }

    public void recalculate() {
        recalculate(false);
    }

    public void setCollapsedAndExpandedTextColor(@Nullable ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList || this.expandedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            this.expandedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedBounds(int i5, int i6, int i7, int i8) {
        if (rectEquals(this.collapsedBounds, i5, i6, i7, i8)) {
            return;
        }
        this.collapsedBounds.set(i5, i6, i7, i8);
        this.boundsChanged = true;
    }

    public void setCollapsedTextAppearance(int i5) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i5);
        if (textAppearance.getTextColor() != null) {
            this.collapsedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.collapsedTextSize = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.collapsedShadowColor = colorStateList;
        }
        this.collapsedShadowDx = textAppearance.shadowDx;
        this.collapsedShadowDy = textAppearance.shadowDy;
        this.collapsedShadowRadius = textAppearance.shadowRadius;
        this.collapsedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.collapsedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setCollapsedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.collapsedFontCallback);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i5) {
        if (this.collapsedTextGravity != i5) {
            this.collapsedTextGravity = i5;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f5) {
        if (this.collapsedTextSize != f5) {
            this.collapsedTextSize = f5;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (setCollapsedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setCurrentOffsetY(int i5) {
        this.currentOffsetY = i5;
    }

    public void setExpandedBounds(int i5, int i6, int i7, int i8) {
        if (rectEquals(this.expandedBounds, i5, i6, i7, i8)) {
            return;
        }
        this.expandedBounds.set(i5, i6, i7, i8);
        this.boundsChanged = true;
    }

    public void setExpandedLetterSpacing(float f5) {
        if (this.expandedLetterSpacing != f5) {
            this.expandedLetterSpacing = f5;
            recalculate();
        }
    }

    public void setExpandedTextAppearance(int i5) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i5);
        if (textAppearance.getTextColor() != null) {
            this.expandedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.expandedTextSize = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.expandedShadowColor = colorStateList;
        }
        this.expandedShadowDx = textAppearance.shadowDx;
        this.expandedShadowDy = textAppearance.shadowDy;
        this.expandedShadowRadius = textAppearance.shadowRadius;
        this.expandedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.expandedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.2
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setExpandedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.expandedFontCallback);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.expandedTextColor != colorStateList) {
            this.expandedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i5) {
        if (this.expandedTextGravity != i5) {
            this.expandedTextGravity = i5;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f5) {
        if (this.expandedTextSize != f5) {
            this.expandedTextSize = f5;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (setExpandedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setExpansionFraction(float f5) {
        float clamp = MathUtils.clamp(f5, 0.0f, 1.0f);
        if (clamp != this.expandedFraction) {
            this.expandedFraction = clamp;
            calculateCurrentOffsets();
        }
    }

    public void setFadeModeEnabled(boolean z4) {
        this.fadeModeEnabled = z4;
    }

    public void setFadeModeStartFraction(float f5) {
        this.fadeModeStartFraction = f5;
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
    }

    @RequiresApi(23)
    public void setHyphenationFrequency(int i5) {
        this.hyphenationFrequency = i5;
    }

    @RequiresApi(23)
    public void setLineSpacingAdd(float f5) {
        this.lineSpacingAdd = f5;
    }

    @RequiresApi(23)
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f5) {
        this.lineSpacingMultiplier = f5;
    }

    public void setMaxLines(int i5) {
        if (i5 != this.maxLines) {
            this.maxLines = i5;
            clearTexture();
            recalculate();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.positionInterpolator = timeInterpolator;
        recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z4) {
        this.isRtlTextDirectionHeuristicsEnabled = z4;
    }

    public final boolean setState(int[] iArr) {
        this.state = iArr;
        if (isStateful()) {
            recalculate();
            return true;
        }
        return false;
    }

    @RequiresApi(23)
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        if (this.staticLayoutBuilderConfigurer != staticLayoutBuilderConfigurer) {
            this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
            recalculate(true);
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        recalculate();
    }

    public void setTitleTextEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.titleTextEllipsize = truncateAt;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean collapsedTypefaceInternal = setCollapsedTypefaceInternal(typeface);
        boolean expandedTypefaceInternal = setExpandedTypefaceInternal(typeface);
        if (collapsedTypefaceInternal || expandedTypefaceInternal) {
            recalculate();
        }
    }

    private void calculateUsingTextSize(float f5, boolean z4) {
        float f6;
        float f7;
        Typeface typeface;
        if (this.text == null) {
            return;
        }
        float width = this.collapsedBounds.width();
        float width2 = this.expandedBounds.width();
        if (isClose(f5, 1.0f)) {
            f6 = this.collapsedTextSize;
            f7 = this.collapsedLetterSpacing;
            this.scale = 1.0f;
            typeface = this.collapsedTypeface;
        } else {
            float f8 = this.expandedTextSize;
            float f9 = this.expandedLetterSpacing;
            Typeface typeface2 = this.expandedTypeface;
            if (isClose(f5, 0.0f)) {
                this.scale = 1.0f;
            } else {
                this.scale = lerp(this.expandedTextSize, this.collapsedTextSize, f5, this.textSizeInterpolator) / this.expandedTextSize;
            }
            float f10 = this.collapsedTextSize / this.expandedTextSize;
            width = (z4 || this.fadeModeEnabled || width2 * f10 <= width) ? width2 : Math.min(width / f10, width2);
            f6 = f8;
            f7 = f9;
            typeface = typeface2;
        }
        if (width > 0.0f) {
            boolean z5 = this.currentTextSize != f6;
            boolean z6 = this.currentLetterSpacing != f7;
            boolean z7 = this.currentTypeface != typeface;
            StaticLayout staticLayout = this.textLayout;
            boolean z8 = z5 || z6 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z7 || this.boundsChanged;
            this.currentTextSize = f6;
            this.currentLetterSpacing = f7;
            this.currentTypeface = typeface;
            this.boundsChanged = false;
            this.textPaint.setLinearText(this.scale != 1.0f);
            r5 = z8;
        }
        if (this.textToDraw == null || r5) {
            this.textPaint.setTextSize(this.currentTextSize);
            this.textPaint.setTypeface(this.currentTypeface);
            this.textPaint.setLetterSpacing(this.currentLetterSpacing);
            this.isRtl = calculateIsRtl(this.text);
            StaticLayout createStaticLayout = createStaticLayout(shouldDrawMultiline() ? this.maxLines : 1, width, this.isRtl);
            this.textLayout = createStaticLayout;
            this.textToDraw = createStaticLayout.getText();
        }
    }

    public void recalculate(boolean z4) {
        if ((this.view.getHeight() <= 0 || this.view.getWidth() <= 0) && !z4) {
            return;
        }
        calculateBaseOffsets(z4);
        calculateCurrentOffsets();
    }

    public void setCollapsedBounds(@NonNull Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedBounds(@NonNull Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
