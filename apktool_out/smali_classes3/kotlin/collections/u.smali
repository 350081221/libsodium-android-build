.class public final Lkotlin/collections/u;
.super Lkotlin/collections/e0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "kotlin/collections/CollectionsKt__CollectionsJVMKt",
        "kotlin/collections/CollectionsKt__CollectionsKt",
        "kotlin/collections/CollectionsKt__IterablesKt",
        "kotlin/collections/CollectionsKt__IteratorsJVMKt",
        "kotlin/collections/CollectionsKt__IteratorsKt",
        "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt",
        "kotlin/collections/CollectionsKt__MutableCollectionsKt",
        "kotlin/collections/CollectionsKt__ReversedViewsKt",
        "kotlin/collections/CollectionsKt___CollectionsJvmKt",
        "kotlin/collections/CollectionsKt___CollectionsKt"
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

    invoke-direct {p0}, Lkotlin/collections/e0;-><init>()V

    return-void
.end method

.method public static bridge synthetic A4(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->A4(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic B2(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->B2(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic B4(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->B4(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic D0(Ljava/lang/Iterable;Lv3/l;)Z
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->D0(Ljava/lang/Iterable;Lv3/l;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic D2(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->D2(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic E()Ljava/util/List;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Lkotlin/collections/w;->E()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic E0(Ljava/util/Collection;Ljava/lang/Iterable;)Z
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->E0(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic F(Ljava/util/Collection;)Lkotlin/ranges/l;
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/w;->F(Ljava/util/Collection;)Lkotlin/ranges/l;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic G(Ljava/util/List;)I
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lkotlin/collections/w;->G(Ljava/util/List;)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic G0(Ljava/util/Collection;Lkotlin/sequences/m;)Z
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/sequences/m;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->G0(Ljava/util/Collection;Lkotlin/sequences/m;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic G5(Ljava/lang/Iterable;I)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->G5(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic H0(Ljava/util/Collection;[Ljava/lang/Object;)Z
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->H0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic I0(Ljava/util/List;Lv3/l;)Z
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->I0(Ljava/util/List;Lv3/l;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic J0(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/r;
        }
    .end annotation

    invoke-static {p0}, Lkotlin/collections/b0;->J0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic K0(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/r;
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/b0;->K0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge varargs synthetic L([Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .param p0    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/w;->L([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic L0(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/r;
        }
    .end annotation

    invoke-static {p0}, Lkotlin/collections/b0;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic M(Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/w;->M(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic M0(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/r;
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/b0;->M0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic M3(Ljava/lang/Iterable;)Ljava/lang/Comparable;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->M3(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static bridge varargs synthetic N([Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .param p0    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/w;->N([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic N0(Ljava/lang/Iterable;Lv3/l;)Z
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->N0(Ljava/lang/Iterable;Lv3/l;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic O0(Ljava/util/Collection;Ljava/lang/Iterable;)Z
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->O0(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic O3(Ljava/lang/Iterable;)Ljava/lang/Float;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->O3(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static bridge varargs synthetic P([Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .param p0    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/w;->P([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic P5(Ljava/util/Collection;)[F
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->P5(Ljava/util/Collection;)[F

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic R5(Ljava/util/Collection;)[I
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->R5(Ljava/util/Collection;)[I

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic S5(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->S5(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic T1(Ljava/lang/Iterable;Ljava/lang/Object;)Z
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/e0;->T1(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic T2(Ljava/util/List;I)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->T2(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic T5(Ljava/util/Collection;)[J
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->T5(Ljava/util/Collection;)[J

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic U1(Ljava/lang/Iterable;)I
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lkotlin/collections/e0;->U1(Ljava/lang/Iterable;)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic U4(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->U4(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic V()V
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    invoke-static {}, Lkotlin/collections/w;->V()V

    return-void
.end method

.method public static bridge synthetic V5(Ljava/util/Collection;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->V5(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic W()V
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    invoke-static {}, Lkotlin/collections/w;->W()V

    return-void
.end method

.method public static bridge synthetic W5(Ljava/lang/Iterable;)Ljava/util/Set;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->W5(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic X0(Ljava/util/List;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/c0;->X0(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic X1(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->X1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic X5(Ljava/lang/Iterable;)Ljava/util/Set;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->X5(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic Y(Ljava/lang/Iterable;I)I
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/a1;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/x;->Y(Ljava/lang/Iterable;I)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic Z1(Ljava/lang/Iterable;I)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->Z1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic Z2(Ljava/lang/Iterable;Ljava/lang/Object;)I
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/e0;->Z2(Ljava/lang/Iterable;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic a(Ljava/util/List;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic a0(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/x;->a0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic a2(Ljava/util/List;I)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->a2(Ljava/util/List;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic c0(Ljava/util/Enumeration;)Ljava/util/Iterator;
    .locals 0
    .param p0    # Ljava/util/Enumeration;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/y;->c0(Ljava/util/Enumeration;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic c5(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lkotlin/collections/e0;->c5(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d6(Ljava/lang/Iterable;IIZLv3/l;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkotlin/collections/e0;->d6(Ljava/lang/Iterable;IIZLv3/l;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e4(Ljava/lang/Iterable;)Ljava/lang/Comparable;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->e4(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e5(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lkotlin/collections/e0;->e5(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic f3(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->f3(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic f6(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->f6(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic g4(Ljava/lang/Iterable;)Ljava/lang/Float;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->g4(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic h2(Ljava/lang/Iterable;I)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->h2(Ljava/lang/Iterable;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic h3(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv3/l;ILjava/lang/Object;)Ljava/lang/Appendable;
    .locals 0

    invoke-static/range {p0 .. p9}, Lkotlin/collections/e0;->h3(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv3/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic h5(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->h5(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic i()Ljava/util/List;
    .locals 1
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Lkotlin/collections/v;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic j(I)Ljava/util/List;
    .locals 0
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/v;->j(I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic j0(Ljava/util/List;)V
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lkotlin/collections/a0;->j0(Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic j3(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv3/l;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static/range {p0 .. p8}, Lkotlin/collections/e0;->j3(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv3/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic j5(Ljava/util/List;Lkotlin/ranges/l;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/ranges/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->j5(Ljava/util/List;Lkotlin/ranges/l;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic k(Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/v;->k(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic m0(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/util/Comparator;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/a0;->m0(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public static bridge synthetic m3(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lkotlin/collections/e0;->m3(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic n0(Ljava/util/Collection;Ljava/lang/Iterable;)Z
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->n0(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic n4(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->n4(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic n5(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->n5(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic o0(Ljava/util/Collection;Lkotlin/sequences/m;)Z
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/sequences/m;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->o0(Ljava/util/Collection;Lkotlin/sequences/m;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic o1(Ljava/util/List;)V
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lkotlin/collections/d0;->o1(Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic p0(Ljava/util/Collection;[Ljava/lang/Object;)Z
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/collections/b0;->p0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic q0(Ljava/lang/Iterable;)Ljava/util/Collection;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/b0;->q0(Ljava/lang/Iterable;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static bridge varargs synthetic r([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 0
    .param p0    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/w;->r([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic r5(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/util/Comparator;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/collections/e0;->r5(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic s3(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->s3(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic t(Ljava/util/List;IILv3/l;)I
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1, p2, p3}, Lkotlin/collections/w;->t(Ljava/util/List;IILv3/l;)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic w(Ljava/util/List;IILv3/l;ILjava/lang/Object;)I
    .locals 0

    invoke-static/range {p0 .. p5}, Lkotlin/collections/w;->w(Ljava/util/List;IILv3/l;ILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic w2(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lkotlin/collections/e0;->w2(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic x(Ljava/util/List;Ljava/lang/Comparable;IIILjava/lang/Object;)I
    .locals 0

    invoke-static/range {p0 .. p5}, Lkotlin/collections/w;->x(Ljava/util/List;Ljava/lang/Comparable;IIILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic x1(Ljava/lang/Iterable;)Lkotlin/sequences/m;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/e0;->x1(Ljava/lang/Iterable;)Lkotlin/sequences/m;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic y2(Ljava/util/List;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Lkotlin/collections/e0;->y2(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
