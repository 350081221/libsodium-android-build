.class public Lcom/airbnb/lottie/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/lottie/k$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/airbnb/lottie/i1;

.field private final b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/layer/e;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/airbnb/lottie/y0;",
            ">;"
        }
    .end annotation
.end field

.field private e:F

.field private f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/airbnb/lottie/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/h;",
            ">;"
        }
    .end annotation
.end field

.field private h:Landroidx/collection/SparseArrayCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/SparseArrayCompat<",
            "Lcom/airbnb/lottie/model/d;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroidx/collection/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LongSparseArray<",
            "Lcom/airbnb/lottie/model/layer/e;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/layer/e;",
            ">;"
        }
    .end annotation
.end field

.field private k:Landroid/graphics/Rect;

.field private l:F

.field private m:F

.field private n:F

.field private o:Z

.field private p:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/airbnb/lottie/i1;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/airbnb/lottie/i1;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/airbnb/lottie/k;->a:Lcom/airbnb/lottie/i1;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/airbnb/lottie/k;->b:Ljava/util/HashSet;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/airbnb/lottie/k;->p:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/airbnb/lottie/utils/f;->e(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/airbnb/lottie/k;->b:Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

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
.end method

.method public b()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/k;->k:Landroid/graphics/Rect;

    return-object v0
.end method

.method public c()Landroidx/collection/SparseArrayCompat;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/SparseArrayCompat<",
            "Lcom/airbnb/lottie/model/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/k;->h:Landroidx/collection/SparseArrayCompat;

    return-object v0
.end method

.method public d()F
    .locals 2

    invoke-virtual {p0}, Lcom/airbnb/lottie/k;->e()F

    move-result v0

    iget v1, p0, Lcom/airbnb/lottie/k;->n:F

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    long-to-float v0, v0

    return v0
.end method

.method public e()F
    .locals 2

    iget v0, p0, Lcom/airbnb/lottie/k;->m:F

    iget v1, p0, Lcom/airbnb/lottie/k;->l:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/k;->m:F

    return v0
.end method

.method public g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/airbnb/lottie/model/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/k;->f:Ljava/util/Map;

    return-object v0
.end method

.method public h(F)F
    .locals 2

    iget v0, p0, Lcom/airbnb/lottie/k;->l:F

    iget v1, p0, Lcom/airbnb/lottie/k;->m:F

    invoke-static {v0, v1, p1}, Lcom/airbnb/lottie/utils/k;->k(FFF)F

    move-result p1

    return p1
.end method

.method public i()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/k;->n:F

    return v0
.end method

.method public j()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/airbnb/lottie/y0;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/airbnb/lottie/k;->e:F

    .line 6
    .line 7
    cmpl-float v1, v0, v1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput v0, p0, Lcom/airbnb/lottie/k;->e:F

    .line 12
    .line 13
    iget-object v1, p0, Lcom/airbnb/lottie/k;->d:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/airbnb/lottie/k;->d:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/airbnb/lottie/y0;

    .line 48
    .line 49
    iget v5, p0, Lcom/airbnb/lottie/k;->e:F

    .line 50
    .line 51
    div-float/2addr v5, v0

    .line 52
    invoke-virtual {v2, v5}, Lcom/airbnb/lottie/y0;->a(F)Lcom/airbnb/lottie/y0;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/k;->d:Ljava/util/Map;

    .line 61
    .line 62
    return-object v0
    .line 63
    .line 64
    .line 65
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
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/layer/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/k;->j:Ljava/util/List;

    return-object v0
.end method

.method public l(Ljava/lang/String;)Lcom/airbnb/lottie/model/h;
    .locals 4
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/k;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/airbnb/lottie/k;->g:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/airbnb/lottie/model/h;

    .line 17
    .line 18
    invoke-virtual {v2, p1}, Lcom/airbnb/lottie/model/h;->d(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return-object p1
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
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
.end method

.method public m()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/k;->g:Ljava/util/List;

    return-object v0
.end method

.method public n()I
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    iget v0, p0, Lcom/airbnb/lottie/k;->p:I

    return v0
.end method

.method public o()Lcom/airbnb/lottie/i1;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/k;->a:Lcom/airbnb/lottie/i1;

    return-object v0
.end method

.method public p(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/layer/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/k;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public q(F)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/airbnb/lottie/k;->l:F

    .line 2
    .line 3
    sub-float/2addr p1, v0

    .line 4
    iget v1, p0, Lcom/airbnb/lottie/k;->m:F

    .line 5
    .line 6
    sub-float/2addr v1, v0

    .line 7
    div-float/2addr p1, v1

    .line 8
    return p1
    .line 9
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
.end method

.method public r()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/k;->l:F

    return v0
.end method

.method public s()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/airbnb/lottie/k;->b:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public t()Z
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/airbnb/lottie/k;->o:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LottieComposition:\n"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/airbnb/lottie/k;->j:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/airbnb/lottie/model/layer/e;

    .line 25
    .line 26
    const-string v3, "\t"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Lcom/airbnb/lottie/model/layer/e;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
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
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/k;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public v(I)V
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    iget v0, p0, Lcom/airbnb/lottie/k;->p:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/airbnb/lottie/k;->p:I

    return-void
.end method

.method public w(Landroid/graphics/Rect;FFFLjava/util/List;Landroidx/collection/LongSparseArray;Ljava/util/Map;Ljava/util/Map;FLandroidx/collection/SparseArrayCompat;Ljava/util/Map;Ljava/util/List;)V
    .locals 0
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "FFF",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/layer/e;",
            ">;",
            "Landroidx/collection/LongSparseArray<",
            "Lcom/airbnb/lottie/model/layer/e;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/layer/e;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/airbnb/lottie/y0;",
            ">;F",
            "Landroidx/collection/SparseArrayCompat<",
            "Lcom/airbnb/lottie/model/d;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/airbnb/lottie/model/c;",
            ">;",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/h;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/airbnb/lottie/k;->k:Landroid/graphics/Rect;

    .line 2
    .line 3
    iput p2, p0, Lcom/airbnb/lottie/k;->l:F

    .line 4
    .line 5
    iput p3, p0, Lcom/airbnb/lottie/k;->m:F

    .line 6
    .line 7
    iput p4, p0, Lcom/airbnb/lottie/k;->n:F

    .line 8
    .line 9
    iput-object p5, p0, Lcom/airbnb/lottie/k;->j:Ljava/util/List;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/airbnb/lottie/k;->i:Landroidx/collection/LongSparseArray;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/airbnb/lottie/k;->c:Ljava/util/Map;

    .line 14
    .line 15
    iput-object p8, p0, Lcom/airbnb/lottie/k;->d:Ljava/util/Map;

    .line 16
    .line 17
    iput p9, p0, Lcom/airbnb/lottie/k;->e:F

    .line 18
    .line 19
    iput-object p10, p0, Lcom/airbnb/lottie/k;->h:Landroidx/collection/SparseArrayCompat;

    .line 20
    .line 21
    iput-object p11, p0, Lcom/airbnb/lottie/k;->f:Ljava/util/Map;

    .line 22
    .line 23
    iput-object p12, p0, Lcom/airbnb/lottie/k;->g:Ljava/util/List;

    .line 24
    .line 25
    return-void
.end method

.method public x(J)Lcom/airbnb/lottie/model/layer/e;
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/k;->i:Landroidx/collection/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroidx/collection/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/airbnb/lottie/model/layer/e;

    return-object p1
.end method

.method public y(Z)V
    .locals 0
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    iput-boolean p1, p0, Lcom/airbnb/lottie/k;->o:Z

    return-void
.end method

.method public z(Z)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/k;->a:Lcom/airbnb/lottie/i1;

    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/i1;->g(Z)V

    return-void
.end method
