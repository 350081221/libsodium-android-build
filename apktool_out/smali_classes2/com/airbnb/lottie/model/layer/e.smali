.class public Lcom/airbnb/lottie/model/layer/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/lottie/model/layer/e$a;,
        Lcom/airbnb/lottie/model/layer/e$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/content/c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/airbnb/lottie/k;

.field private final c:Ljava/lang/String;

.field private final d:J

.field private final e:Lcom/airbnb/lottie/model/layer/e$a;

.field private final f:J

.field private final g:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/content/i;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/airbnb/lottie/model/animatable/l;

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:F

.field private final n:F

.field private final o:F

.field private final p:F

.field private final q:Lcom/airbnb/lottie/model/animatable/j;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final r:Lcom/airbnb/lottie/model/animatable/k;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final s:Lcom/airbnb/lottie/model/animatable/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/value/a<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field private final u:Lcom/airbnb/lottie/model/layer/e$b;

.field private final v:Z

.field private final w:Lcom/airbnb/lottie/model/content/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final x:Lcom/airbnb/lottie/parser/j;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final y:Lcom/airbnb/lottie/model/content/h;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/airbnb/lottie/k;Ljava/lang/String;JLcom/airbnb/lottie/model/layer/e$a;JLjava/lang/String;Ljava/util/List;Lcom/airbnb/lottie/model/animatable/l;IIIFFFFLcom/airbnb/lottie/model/animatable/j;Lcom/airbnb/lottie/model/animatable/k;Ljava/util/List;Lcom/airbnb/lottie/model/layer/e$b;Lcom/airbnb/lottie/model/animatable/b;ZLcom/airbnb/lottie/model/content/a;Lcom/airbnb/lottie/parser/j;Lcom/airbnb/lottie/model/content/h;)V
    .locals 3
    .param p9    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p19    # Lcom/airbnb/lottie/model/animatable/j;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p20    # Lcom/airbnb/lottie/model/animatable/k;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p23    # Lcom/airbnb/lottie/model/animatable/b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p25    # Lcom/airbnb/lottie/model/content/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p26    # Lcom/airbnb/lottie/parser/j;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/content/c;",
            ">;",
            "Lcom/airbnb/lottie/k;",
            "Ljava/lang/String;",
            "J",
            "Lcom/airbnb/lottie/model/layer/e$a;",
            "J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/content/i;",
            ">;",
            "Lcom/airbnb/lottie/model/animatable/l;",
            "IIIFFFF",
            "Lcom/airbnb/lottie/model/animatable/j;",
            "Lcom/airbnb/lottie/model/animatable/k;",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/value/a<",
            "Ljava/lang/Float;",
            ">;>;",
            "Lcom/airbnb/lottie/model/layer/e$b;",
            "Lcom/airbnb/lottie/model/animatable/b;",
            "Z",
            "Lcom/airbnb/lottie/model/content/a;",
            "Lcom/airbnb/lottie/parser/j;",
            "Lcom/airbnb/lottie/model/content/h;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 2
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->a:Ljava/util/List;

    move-object v1, p2

    .line 3
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->b:Lcom/airbnb/lottie/k;

    move-object v1, p3

    .line 4
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->c:Ljava/lang/String;

    move-wide v1, p4

    .line 5
    iput-wide v1, v0, Lcom/airbnb/lottie/model/layer/e;->d:J

    move-object v1, p6

    .line 6
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->e:Lcom/airbnb/lottie/model/layer/e$a;

    move-wide v1, p7

    .line 7
    iput-wide v1, v0, Lcom/airbnb/lottie/model/layer/e;->f:J

    move-object v1, p9

    .line 8
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->g:Ljava/lang/String;

    move-object v1, p10

    .line 9
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->h:Ljava/util/List;

    move-object v1, p11

    .line 10
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->i:Lcom/airbnb/lottie/model/animatable/l;

    move v1, p12

    .line 11
    iput v1, v0, Lcom/airbnb/lottie/model/layer/e;->j:I

    move/from16 v1, p13

    .line 12
    iput v1, v0, Lcom/airbnb/lottie/model/layer/e;->k:I

    move/from16 v1, p14

    .line 13
    iput v1, v0, Lcom/airbnb/lottie/model/layer/e;->l:I

    move/from16 v1, p15

    .line 14
    iput v1, v0, Lcom/airbnb/lottie/model/layer/e;->m:F

    move/from16 v1, p16

    .line 15
    iput v1, v0, Lcom/airbnb/lottie/model/layer/e;->n:F

    move/from16 v1, p17

    .line 16
    iput v1, v0, Lcom/airbnb/lottie/model/layer/e;->o:F

    move/from16 v1, p18

    .line 17
    iput v1, v0, Lcom/airbnb/lottie/model/layer/e;->p:F

    move-object/from16 v1, p19

    .line 18
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->q:Lcom/airbnb/lottie/model/animatable/j;

    move-object/from16 v1, p20

    .line 19
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->r:Lcom/airbnb/lottie/model/animatable/k;

    move-object/from16 v1, p21

    .line 20
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->t:Ljava/util/List;

    move-object/from16 v1, p22

    .line 21
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->u:Lcom/airbnb/lottie/model/layer/e$b;

    move-object/from16 v1, p23

    .line 22
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->s:Lcom/airbnb/lottie/model/animatable/b;

    move/from16 v1, p24

    .line 23
    iput-boolean v1, v0, Lcom/airbnb/lottie/model/layer/e;->v:Z

    move-object/from16 v1, p25

    .line 24
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->w:Lcom/airbnb/lottie/model/content/a;

    move-object/from16 v1, p26

    .line 25
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->x:Lcom/airbnb/lottie/parser/j;

    move-object/from16 v1, p27

    .line 26
    iput-object v1, v0, Lcom/airbnb/lottie/model/layer/e;->y:Lcom/airbnb/lottie/model/content/h;

    return-void
.end method


# virtual methods
.method public a()Lcom/airbnb/lottie/model/content/h;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->y:Lcom/airbnb/lottie/model/content/h;

    return-object v0
.end method

.method public b()Lcom/airbnb/lottie/model/content/a;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->w:Lcom/airbnb/lottie/model/content/a;

    return-object v0
.end method

.method c()Lcom/airbnb/lottie/k;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->b:Lcom/airbnb/lottie/k;

    return-object v0
.end method

.method public d()Lcom/airbnb/lottie/parser/j;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->x:Lcom/airbnb/lottie/parser/j;

    return-object v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/airbnb/lottie/model/layer/e;->d:J

    return-wide v0
.end method

.method f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/value/a<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->t:Ljava/util/List;

    return-object v0
.end method

.method public g()Lcom/airbnb/lottie/model/layer/e$a;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->e:Lcom/airbnb/lottie/model/layer/e$a;

    return-object v0
.end method

.method h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/content/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->h:Ljava/util/List;

    return-object v0
.end method

.method i()Lcom/airbnb/lottie/model/layer/e$b;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->u:Lcom/airbnb/lottie/model/layer/e$b;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method k()J
    .locals 2

    iget-wide v0, p0, Lcom/airbnb/lottie/model/layer/e;->f:J

    return-wide v0
.end method

.method l()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/model/layer/e;->p:F

    return v0
.end method

.method m()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/model/layer/e;->o:F

    return v0
.end method

.method public n()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->g:Ljava/lang/String;

    return-object v0
.end method

.method o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/content/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->a:Ljava/util/List;

    return-object v0
.end method

.method p()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/model/layer/e;->l:I

    return v0
.end method

.method q()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/model/layer/e;->k:I

    return v0
.end method

.method r()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/model/layer/e;->j:I

    return v0
.end method

.method s()F
    .locals 2

    iget v0, p0, Lcom/airbnb/lottie/model/layer/e;->n:F

    iget-object v1, p0, Lcom/airbnb/lottie/model/layer/e;->b:Lcom/airbnb/lottie/k;

    invoke-virtual {v1}, Lcom/airbnb/lottie/k;->e()F

    move-result v1

    div-float/2addr v0, v1

    return v0
.end method

.method t()Lcom/airbnb/lottie/model/animatable/j;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->q:Lcom/airbnb/lottie/model/animatable/j;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/model/layer/e;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
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
.end method

.method u()Lcom/airbnb/lottie/model/animatable/k;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->r:Lcom/airbnb/lottie/model/animatable/k;

    return-object v0
.end method

.method v()Lcom/airbnb/lottie/model/animatable/b;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->s:Lcom/airbnb/lottie/model/animatable/b;

    return-object v0
.end method

.method w()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/model/layer/e;->m:F

    return v0
.end method

.method x()Lcom/airbnb/lottie/model/animatable/l;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/e;->i:Lcom/airbnb/lottie/model/animatable/l;

    return-object v0
.end method

.method public y()Z
    .locals 1

    iget-boolean v0, p0, Lcom/airbnb/lottie/model/layer/e;->v:Z

    return v0
.end method

.method public z(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/airbnb/lottie/model/layer/e;->j()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "\n"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/airbnb/lottie/model/layer/e;->b:Lcom/airbnb/lottie/k;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/airbnb/lottie/model/layer/e;->k()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    invoke-virtual {v2, v3, v4}, Lcom/airbnb/lottie/k;->x(J)Lcom/airbnb/lottie/model/layer/e;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const-string v3, "\t\tParents: "

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/airbnb/lottie/model/layer/e;->j()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/e;->b:Lcom/airbnb/lottie/k;

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/airbnb/lottie/model/layer/e;->k()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    invoke-virtual {v3, v4, v5}, Lcom/airbnb/lottie/k;->x(J)Lcom/airbnb/lottie/model/layer/e;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :goto_0
    if-eqz v2, :cond_0

    .line 56
    .line 57
    const-string v3, "->"

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lcom/airbnb/lottie/model/layer/e;->j()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/e;->b:Lcom/airbnb/lottie/k;

    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/airbnb/lottie/model/layer/e;->k()J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    invoke-virtual {v3, v4, v5}, Lcom/airbnb/lottie/k;->x(J)Lcom/airbnb/lottie/model/layer/e;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {p0}, Lcom/airbnb/lottie/model/layer/e;->h()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v2, "\tMasks: "

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/airbnb/lottie/model/layer/e;->h()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_2
    invoke-virtual {p0}, Lcom/airbnb/lottie/model/layer/e;->r()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_3

    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/airbnb/lottie/model/layer/e;->q()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_3

    .line 129
    .line 130
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v2, "\tBackground: "

    .line 134
    .line 135
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 139
    .line 140
    const/4 v3, 0x3

    .line 141
    new-array v3, v3, [Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/airbnb/lottie/model/layer/e;->r()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    const/4 v5, 0x0

    .line 152
    aput-object v4, v3, v5

    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/airbnb/lottie/model/layer/e;->q()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    const/4 v5, 0x1

    .line 163
    aput-object v4, v3, v5

    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/airbnb/lottie/model/layer/e;->p()I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    const/4 v5, 0x2

    .line 174
    aput-object v4, v3, v5

    .line 175
    .line 176
    const-string v4, "%dx%d %X\n"

    .line 177
    .line 178
    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    :cond_3
    iget-object v2, p0, Lcom/airbnb/lottie/model/layer/e;->a:Ljava/util/List;

    .line 186
    .line 187
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-nez v2, :cond_4

    .line 192
    .line 193
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v2, "\tShapes:\n"

    .line 197
    .line 198
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    iget-object v2, p0, Lcom/airbnb/lottie/model/layer/e;->a:Ljava/util/List;

    .line 202
    .line 203
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_4

    .line 212
    .line 213
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string v4, "\t\t"

    .line 221
    .line 222
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    return-object p1
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
.end method
