.class public final Lkotlin/comparisons/a;
.super Lkotlin/comparisons/i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "kotlin/comparisons/ComparisonsKt__ComparisonsKt",
        "kotlin/comparisons/ComparisonsKt___ComparisonsJvmKt",
        "kotlin/comparisons/ComparisonsKt___ComparisonsKt"
    }
    k = 0x4
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x31
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/comparisons/i;-><init>()V

    return-void
.end method

.method public static bridge varargs synthetic Q(F[F)F
    .locals 0
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    invoke-static {p0, p1}, Lkotlin/comparisons/h;->Q(F[F)F

    move-result p0

    return p0
.end method

.method public static bridge varargs synthetic T(I[I)I
    .locals 0
    .param p1    # [I
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    invoke-static {p0, p1}, Lkotlin/comparisons/h;->T(I[I)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic X(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;
    .locals 0
    .param p0    # Ljava/lang/Comparable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Comparable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.1"
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/comparisons/h;->X(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0
    .param p0    # Ljava/lang/Comparable;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Comparable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/comparisons/g;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p0

    return p0
.end method

.method public static bridge varargs synthetic l0(F[F)F
    .locals 0
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    invoke-static {p0, p1}, Lkotlin/comparisons/h;->l0(F[F)F

    move-result p0

    return p0
.end method

.method public static bridge synthetic q()Ljava/util/Comparator;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Lkotlin/comparisons/g;->q()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic x()Ljava/util/Comparator;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Lkotlin/comparisons/g;->x()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method
