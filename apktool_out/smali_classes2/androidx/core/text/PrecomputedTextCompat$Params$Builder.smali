.class public Landroidx/core/text/PrecomputedTextCompat$Params$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/text/PrecomputedTextCompat$Params;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mBreakStrategy:I

.field private mHyphenationFrequency:I

.field private final mPaint:Landroid/text/TextPaint;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private mTextDir:Landroid/text/TextDirectionHeuristic;


# direct methods
.method public constructor <init>(Landroid/text/TextPaint;)V
    .locals 0
    .param p1    # Landroid/text/TextPaint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mPaint:Landroid/text/TextPaint;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput p1, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mBreakStrategy:I

    .line 8
    .line 9
    iput p1, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mHyphenationFrequency:I

    .line 10
    .line 11
    sget-object p1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mTextDir:Landroid/text/TextDirectionHeuristic;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public build()Landroidx/core/text/PrecomputedTextCompat$Params;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroidx/core/text/PrecomputedTextCompat$Params;

    iget-object v1, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mPaint:Landroid/text/TextPaint;

    iget-object v2, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mTextDir:Landroid/text/TextDirectionHeuristic;

    iget v3, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mBreakStrategy:I

    iget v4, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mHyphenationFrequency:I

    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/core/text/PrecomputedTextCompat$Params;-><init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V

    return-object v0
.end method

.method public setBreakStrategy(I)Landroidx/core/text/PrecomputedTextCompat$Params$Builder;
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x17
    .end annotation

    iput p1, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mBreakStrategy:I

    return-object p0
.end method

.method public setHyphenationFrequency(I)Landroidx/core/text/PrecomputedTextCompat$Params$Builder;
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x17
    .end annotation

    iput p1, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mHyphenationFrequency:I

    return-object p0
.end method

.method public setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroidx/core/text/PrecomputedTextCompat$Params$Builder;
    .locals 0
    .param p1    # Landroid/text/TextDirectionHeuristic;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/core/text/PrecomputedTextCompat$Params$Builder;->mTextDir:Landroid/text/TextDirectionHeuristic;

    return-object p0
.end method
