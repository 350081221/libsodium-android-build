.class public Lcom/yuanqi/group/widgets/fittext/FitTextView;
.super Lcom/yuanqi/group/widgets/fittext/BaseTextView;
.source "SourceFile"


# instance fields
.field private j:Z

.field private k:Z

.field protected l:F

.field private m:F

.field private n:F

.field protected o:Ljava/lang/CharSequence;

.field protected volatile p:Z

.field protected q:Lcom/yuanqi/group/widgets/fittext/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/group/widgets/fittext/FitTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/yuanqi/group/widgets/fittext/FitTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 4
    iput-boolean p3, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->j:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->k:Z

    const/4 v1, 0x0

    .line 6
    iput v1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->l:F

    .line 7
    iput-boolean p3, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->p:Z

    .line 8
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v1

    iput v1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->l:F

    if-eqz p2, :cond_0

    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 9
    fill-array-data v1, :array_0

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 10
    iget p2, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->l:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr p2, v1

    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->n:F

    .line 11
    iget p2, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->l:F

    div-float/2addr p2, v1

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->m:F

    .line 12
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .line 13
    :cond_0
    iput v1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->m:F

    .line 14
    iput v1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->n:F

    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x7f040237
        0x7f040238
    .end array-data
.end method


# virtual methods
.method public bridge synthetic c()Z
    .locals 1

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->c()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic d()Z
    .locals 1

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->d()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic e()Z
    .locals 1

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->e()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic f()Z
    .locals 1

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->f()Z

    move-result v0

    return v0
.end method

.method protected getFitTextHelper()Lcom/yuanqi/group/widgets/fittext/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->q:Lcom/yuanqi/group/widgets/fittext/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/yuanqi/group/widgets/fittext/a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/yuanqi/group/widgets/fittext/a;-><init>(Lcom/yuanqi/group/widgets/fittext/BaseTextView;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->q:Lcom/yuanqi/group/widgets/fittext/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->q:Lcom/yuanqi/group/widgets/fittext/a;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public bridge synthetic getIncludeFontPaddingCompat()Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->getIncludeFontPaddingCompat()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic getLineSpacingExtraCompat()F
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->getLineSpacingExtraCompat()F

    move-result v0

    return v0
.end method

.method public bridge synthetic getLineSpacingMultiplierCompat()F
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->getLineSpacingMultiplierCompat()F

    move-result v0

    return v0
.end method

.method public bridge synthetic getMaxLinesCompat()I
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->getMaxLinesCompat()I

    move-result v0

    return v0
.end method

.method public getMaxTextSize()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->n:F

    return v0
.end method

.method public getMinTextSize()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->m:F

    return v0
.end method

.method public getOriginalText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->o:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getOriginalTextSize()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->l:F

    return v0
.end method

.method public bridge synthetic getTextHeight()I
    .locals 1

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->getTextHeight()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getTextLineHeight()F
    .locals 1

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->getTextLineHeight()F

    move-result v0

    return v0
.end method

.method public bridge synthetic getTextView()Landroid/widget/TextView;
    .locals 1

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->getTextView()Landroid/widget/TextView;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getTextWidth()I
    .locals 1

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->getTextWidth()I

    move-result v0

    return v0
.end method

.method protected h(Ljava/lang/CharSequence;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->j:Z

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->p:Z

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->a:Z

    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->p:Z

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/fittext/FitTextView;->getFitTextHelper()Lcom/yuanqi/group/widgets/fittext/a;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget v2, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->n:F

    .line 37
    .line 38
    iget v3, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->m:F

    .line 39
    .line 40
    invoke-virtual {v1, v0, p1, v2, v3}, Lcom/yuanqi/group/widgets/fittext/a;->a(Landroid/text/TextPaint;Ljava/lang/CharSequence;FF)F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-super {p0, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/fittext/FitTextView;->getFitTextHelper()Lcom/yuanqi/group/widgets/fittext/a;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, p1, v2}, Lcom/yuanqi/group/widgets/fittext/a;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-super {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    iput-boolean v1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->p:Z

    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->k:Z

    return v0
.end method

.method public bridge synthetic isSingleLine()Z
    .locals 1

    invoke-super {p0}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->isSingleLine()Z

    move-result v0

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    iget p1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->l:F

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-super {p0, p2, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 20
    .line 21
    .line 22
    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->j:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->j:Z

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/fittext/FitTextView;->getOriginalText()Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/fittext/FitTextView;->h(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public bridge synthetic setBoldText(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->setBoldText(Z)V

    return-void
.end method

.method public bridge synthetic setIncludeFontPadding(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->setIncludeFontPadding(Z)V

    return-void
.end method

.method public bridge synthetic setItalicText(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->setItalicText(Z)V

    return-void
.end method

.method public bridge synthetic setJustify(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->setJustify(Z)V

    return-void
.end method

.method public bridge synthetic setKeepWord(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->setKeepWord(Z)V

    return-void
.end method

.method public bridge synthetic setLineEndNoSpace(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->setLineEndNoSpace(Z)V

    return-void
.end method

.method public bridge synthetic setLineSpacing(FF)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->setLineSpacing(FF)V

    return-void
.end method

.method public bridge synthetic setMaxLines(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->setMaxLines(I)V

    return-void
.end method

.method public setMaxTextSize(F)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->n:F

    return-void
.end method

.method public setMinTextSize(F)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->m:F

    return-void
.end method

.method public setNeedFit(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->k:Z

    return-void
.end method

.method public bridge synthetic setSingleLine(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/yuanqi/group/widgets/fittext/BaseTextView;->setSingleLine(Z)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->o:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/fittext/FitTextView;->h(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public setTextSize(IF)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lcom/yuanqi/group/widgets/fittext/FitTextView;->l:F

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
