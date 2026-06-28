.class Landroidx/transition/Transition$Impl26;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Impl26"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getTotalDuration(Landroid/animation/Animator;)J
    .locals 2
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-virtual {p0}, Landroid/animation/Animator;->getTotalDuration()J

    move-result-wide v0

    return-wide v0
.end method

.method static setCurrentPlayTime(Landroid/animation/Animator;J)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    check-cast p0, Landroid/animation/AnimatorSet;

    invoke-static {p0, p1, p2}, Landroidx/transition/c;->a(Landroid/animation/AnimatorSet;J)V

    return-void
.end method
