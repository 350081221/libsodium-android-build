.class public final Lcom/zzhoujay/richtext/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zzhoujay/richtext/g$b;
    }
.end annotation


# static fields
.field public static final B:Ljava/lang/String; = "com.zzhoujay.okhttpimagedownloader.OkHttpImageDownloader"


# instance fields
.field private final A:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final a:Ljava/lang/String;

.field public final b:Lcom/zzhoujay/richtext/i;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Lcom/zzhoujay/richtext/c$b;

.field public final g:Lcom/zzhoujay/richtext/b;

.field public final h:I

.field public final i:I

.field public final j:Le3/e;

.field public final k:Le3/h;

.field public final l:Z

.field public final m:I

.field public final n:Le3/i;

.field public final o:Le3/k;

.field public final p:Le3/j;

.field public final q:Le3/l;

.field public final r:Le3/b;

.field public final s:Lcom/zzhoujay/richtext/drawable/a;

.field final t:Le3/f;

.field public final u:Z

.field public final v:Z

.field public final w:Lcom/zzhoujay/richtext/ig/i;

.field public final x:Le3/d;

.field public final y:Le3/d;

.field private z:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/zzhoujay/richtext/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/zzhoujay/richtext/g$b;)V
    .locals 28

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    .line 2
    iget-object v2, v0, Lcom/zzhoujay/richtext/g$b;->a:Ljava/lang/String;

    iget-object v3, v0, Lcom/zzhoujay/richtext/g$b;->b:Lcom/zzhoujay/richtext/i;

    iget-boolean v4, v0, Lcom/zzhoujay/richtext/g$b;->c:Z

    iget-boolean v5, v0, Lcom/zzhoujay/richtext/g$b;->d:Z

    iget-object v6, v0, Lcom/zzhoujay/richtext/g$b;->e:Lcom/zzhoujay/richtext/b;

    iget-object v7, v0, Lcom/zzhoujay/richtext/g$b;->f:Le3/e;

    iget-object v8, v0, Lcom/zzhoujay/richtext/g$b;->g:Le3/h;

    iget-boolean v9, v0, Lcom/zzhoujay/richtext/g$b;->h:Z

    iget v10, v0, Lcom/zzhoujay/richtext/g$b;->i:I

    iget-object v11, v0, Lcom/zzhoujay/richtext/g$b;->j:Le3/i;

    iget-object v12, v0, Lcom/zzhoujay/richtext/g$b;->k:Le3/k;

    iget-object v13, v0, Lcom/zzhoujay/richtext/g$b;->l:Le3/j;

    iget-object v14, v0, Lcom/zzhoujay/richtext/g$b;->m:Le3/l;

    iget-object v15, v0, Lcom/zzhoujay/richtext/g$b;->n:Le3/f;

    move-object/from16 v27, v1

    iget-object v1, v0, Lcom/zzhoujay/richtext/g$b;->o:Le3/b;

    move-object/from16 v16, v1

    iget-boolean v1, v0, Lcom/zzhoujay/richtext/g$b;->q:Z

    move/from16 v17, v1

    iget-object v1, v0, Lcom/zzhoujay/richtext/g$b;->r:Lcom/zzhoujay/richtext/c$b;

    move-object/from16 v18, v1

    iget v1, v0, Lcom/zzhoujay/richtext/g$b;->s:I

    move/from16 v19, v1

    iget v1, v0, Lcom/zzhoujay/richtext/g$b;->t:I

    move/from16 v20, v1

    iget-object v1, v0, Lcom/zzhoujay/richtext/g$b;->u:Lcom/zzhoujay/richtext/drawable/a;

    move-object/from16 v21, v1

    iget-boolean v1, v0, Lcom/zzhoujay/richtext/g$b;->v:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lcom/zzhoujay/richtext/g$b;->w:Z

    move/from16 v23, v1

    iget-object v1, v0, Lcom/zzhoujay/richtext/g$b;->x:Lcom/zzhoujay/richtext/ig/i;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/zzhoujay/richtext/g$b;->y:Le3/d;

    move-object/from16 v25, v1

    iget-object v0, v0, Lcom/zzhoujay/richtext/g$b;->z:Le3/d;

    move-object/from16 v26, v0

    move-object/from16 v1, v27

    invoke-direct/range {v1 .. v26}, Lcom/zzhoujay/richtext/g;-><init>(Ljava/lang/String;Lcom/zzhoujay/richtext/i;ZZLcom/zzhoujay/richtext/b;Le3/e;Le3/h;ZILe3/i;Le3/k;Le3/j;Le3/l;Le3/f;Le3/b;ZLcom/zzhoujay/richtext/c$b;IILcom/zzhoujay/richtext/drawable/a;ZZLcom/zzhoujay/richtext/ig/i;Le3/d;Le3/d;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/zzhoujay/richtext/g$b;Lcom/zzhoujay/richtext/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zzhoujay/richtext/g;-><init>(Lcom/zzhoujay/richtext/g$b;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/zzhoujay/richtext/i;ZZLcom/zzhoujay/richtext/b;Le3/e;Le3/h;ZILe3/i;Le3/k;Le3/j;Le3/l;Le3/f;Le3/b;ZLcom/zzhoujay/richtext/c$b;IILcom/zzhoujay/richtext/drawable/a;ZZLcom/zzhoujay/richtext/ig/i;Le3/d;Le3/d;)V
    .locals 6

    move-object v0, p0

    move-object/from16 v1, p10

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object/from16 v4, p13

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v5, p1

    .line 4
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->a:Ljava/lang/String;

    move-object v5, p2

    .line 5
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->b:Lcom/zzhoujay/richtext/i;

    move v5, p3

    .line 6
    iput-boolean v5, v0, Lcom/zzhoujay/richtext/g;->c:Z

    move v5, p4

    .line 7
    iput-boolean v5, v0, Lcom/zzhoujay/richtext/g;->d:Z

    move-object v5, p6

    .line 8
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->j:Le3/e;

    move-object v5, p7

    .line 9
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->k:Le3/h;

    move v5, p8

    .line 10
    iput-boolean v5, v0, Lcom/zzhoujay/richtext/g;->l:Z

    move-object v5, p5

    .line 11
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->g:Lcom/zzhoujay/richtext/b;

    .line 12
    iput-object v1, v0, Lcom/zzhoujay/richtext/g;->n:Le3/i;

    .line 13
    iput-object v2, v0, Lcom/zzhoujay/richtext/g;->o:Le3/k;

    .line 14
    iput-object v3, v0, Lcom/zzhoujay/richtext/g;->p:Le3/j;

    .line 15
    iput-object v4, v0, Lcom/zzhoujay/richtext/g;->q:Le3/l;

    move-object/from16 v5, p14

    .line 16
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->t:Le3/f;

    move-object/from16 v5, p15

    .line 17
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->r:Le3/b;

    move-object/from16 v5, p17

    .line 18
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->f:Lcom/zzhoujay/richtext/c$b;

    move/from16 v5, p16

    .line 19
    iput-boolean v5, v0, Lcom/zzhoujay/richtext/g;->e:Z

    move/from16 v5, p18

    .line 20
    iput v5, v0, Lcom/zzhoujay/richtext/g;->h:I

    move/from16 v5, p19

    .line 21
    iput v5, v0, Lcom/zzhoujay/richtext/g;->i:I

    move-object/from16 v5, p20

    .line 22
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->s:Lcom/zzhoujay/richtext/drawable/a;

    move/from16 v5, p21

    .line 23
    iput-boolean v5, v0, Lcom/zzhoujay/richtext/g;->u:Z

    move/from16 v5, p22

    .line 24
    iput-boolean v5, v0, Lcom/zzhoujay/richtext/g;->v:Z

    move-object/from16 v5, p23

    .line 25
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->w:Lcom/zzhoujay/richtext/ig/i;

    move-object/from16 v5, p24

    .line 26
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->x:Le3/d;

    move-object/from16 v5, p25

    .line 27
    iput-object v5, v0, Lcom/zzhoujay/richtext/g;->y:Le3/d;

    if-nez p9, :cond_1

    if-nez v3, :cond_0

    if-nez v4, :cond_0

    if-nez v1, :cond_0

    if-eqz v2, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, p9

    .line 28
    :goto_0
    iput v1, v0, Lcom/zzhoujay/richtext/g;->m:I

    .line 29
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/zzhoujay/richtext/g;->A:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/g;->A:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Lcom/zzhoujay/richtext/f;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/g;->z:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/zzhoujay/richtext/f;

    :goto_0
    return-object v0
.end method

.method public c()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/g;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zzhoujay/richtext/g;->b:Lcom/zzhoujay/richtext/i;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/g;->c:Z

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/g;->d:Z

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/g;->e:Z

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    mul-int/lit8 v0, v0, 0x1f

    .line 32
    .line 33
    iget-object v1, p0, Lcom/zzhoujay/richtext/g;->f:Lcom/zzhoujay/richtext/c$b;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v0, v1

    .line 40
    mul-int/lit8 v0, v0, 0x1f

    .line 41
    .line 42
    iget-object v1, p0, Lcom/zzhoujay/richtext/g;->g:Lcom/zzhoujay/richtext/b;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    mul-int/lit8 v0, v0, 0x1f

    .line 50
    .line 51
    iget v1, p0, Lcom/zzhoujay/richtext/g;->h:I

    .line 52
    .line 53
    add-int/2addr v0, v1

    .line 54
    mul-int/lit8 v0, v0, 0x1f

    .line 55
    .line 56
    iget v1, p0, Lcom/zzhoujay/richtext/g;->i:I

    .line 57
    .line 58
    add-int/2addr v0, v1

    .line 59
    mul-int/lit8 v0, v0, 0x1f

    .line 60
    .line 61
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/g;->l:Z

    .line 62
    .line 63
    add-int/2addr v0, v1

    .line 64
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget v1, p0, Lcom/zzhoujay/richtext/g;->m:I

    .line 67
    .line 68
    add-int/2addr v0, v1

    .line 69
    mul-int/lit8 v0, v0, 0x1f

    .line 70
    .line 71
    iget-object v1, p0, Lcom/zzhoujay/richtext/g;->s:Lcom/zzhoujay/richtext/drawable/a;

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/zzhoujay/richtext/drawable/a;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v0, v1

    .line 78
    return v0
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/g;->A:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method e(Lcom/zzhoujay/richtext/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/g;->z:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/zzhoujay/richtext/g;->z:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    :cond_0
    return-void
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
.end method
