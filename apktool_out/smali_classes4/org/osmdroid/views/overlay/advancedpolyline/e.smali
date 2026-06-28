.class public Lorg/osmdroid/views/overlay/advancedpolyline/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lorg/osmdroid/views/overlay/advancedpolyline/d;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private c:F

.field private d:F


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/overlay/advancedpolyline/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->b:Ljava/util/List;

    .line 10
    .line 11
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 12
    .line 13
    .line 14
    iput v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->c:F

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->d:F

    .line 18
    .line 19
    iput-object p1, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->a:Lorg/osmdroid/views/overlay/advancedpolyline/d;

    .line 20
    .line 21
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public a(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->a:Lorg/osmdroid/views/overlay/advancedpolyline/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/advancedpolyline/d;->b(F)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->c:F

    .line 16
    .line 17
    cmpl-float v0, v0, p1

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    iput p1, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->c:F

    .line 22
    .line 23
    :cond_0
    iget v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->d:F

    .line 24
    .line 25
    cmpg-float v0, v0, p1

    .line 26
    .line 27
    if-gez v0, :cond_1

    .line 28
    .line 29
    iput p1, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->d:F

    .line 30
    .line 31
    :cond_1
    return-void
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
.end method

.method public b()Lorg/osmdroid/views/overlay/advancedpolyline/d;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->a:Lorg/osmdroid/views/overlay/advancedpolyline/d;

    return-object v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->d:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->c:F

    return v0
.end method

.method public e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/lang/Float;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget-object v3, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->a:Lorg/osmdroid/views/overlay/advancedpolyline/d;

    .line 25
    .line 26
    invoke-virtual {v3, v1, v2}, Lorg/osmdroid/views/overlay/advancedpolyline/d;->d(IF)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/advancedpolyline/e;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
