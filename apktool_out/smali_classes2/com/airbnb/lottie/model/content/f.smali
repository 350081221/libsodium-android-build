.class public Lcom/airbnb/lottie/model/content/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/airbnb/lottie/model/content/c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/airbnb/lottie/model/content/g;

.field private final c:Lcom/airbnb/lottie/model/animatable/c;

.field private final d:Lcom/airbnb/lottie/model/animatable/d;

.field private final e:Lcom/airbnb/lottie/model/animatable/f;

.field private final f:Lcom/airbnb/lottie/model/animatable/f;

.field private final g:Lcom/airbnb/lottie/model/animatable/b;

.field private final h:Lcom/airbnb/lottie/model/content/s$b;

.field private final i:Lcom/airbnb/lottie/model/content/s$c;

.field private final j:F

.field private final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/animatable/b;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/airbnb/lottie/model/animatable/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/airbnb/lottie/model/content/g;Lcom/airbnb/lottie/model/animatable/c;Lcom/airbnb/lottie/model/animatable/d;Lcom/airbnb/lottie/model/animatable/f;Lcom/airbnb/lottie/model/animatable/f;Lcom/airbnb/lottie/model/animatable/b;Lcom/airbnb/lottie/model/content/s$b;Lcom/airbnb/lottie/model/content/s$c;FLjava/util/List;Lcom/airbnb/lottie/model/animatable/b;Z)V
    .locals 0
    .param p12    # Lcom/airbnb/lottie/model/animatable/b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/airbnb/lottie/model/content/g;",
            "Lcom/airbnb/lottie/model/animatable/c;",
            "Lcom/airbnb/lottie/model/animatable/d;",
            "Lcom/airbnb/lottie/model/animatable/f;",
            "Lcom/airbnb/lottie/model/animatable/f;",
            "Lcom/airbnb/lottie/model/animatable/b;",
            "Lcom/airbnb/lottie/model/content/s$b;",
            "Lcom/airbnb/lottie/model/content/s$c;",
            "F",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/animatable/b;",
            ">;",
            "Lcom/airbnb/lottie/model/animatable/b;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/airbnb/lottie/model/content/f;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/airbnb/lottie/model/content/f;->b:Lcom/airbnb/lottie/model/content/g;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/airbnb/lottie/model/content/f;->c:Lcom/airbnb/lottie/model/animatable/c;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/airbnb/lottie/model/content/f;->d:Lcom/airbnb/lottie/model/animatable/d;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/airbnb/lottie/model/content/f;->e:Lcom/airbnb/lottie/model/animatable/f;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/airbnb/lottie/model/content/f;->f:Lcom/airbnb/lottie/model/animatable/f;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/airbnb/lottie/model/content/f;->g:Lcom/airbnb/lottie/model/animatable/b;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/airbnb/lottie/model/content/f;->h:Lcom/airbnb/lottie/model/content/s$b;

    .line 19
    .line 20
    iput-object p9, p0, Lcom/airbnb/lottie/model/content/f;->i:Lcom/airbnb/lottie/model/content/s$c;

    .line 21
    .line 22
    iput p10, p0, Lcom/airbnb/lottie/model/content/f;->j:F

    .line 23
    .line 24
    iput-object p11, p0, Lcom/airbnb/lottie/model/content/f;->k:Ljava/util/List;

    .line 25
    .line 26
    iput-object p12, p0, Lcom/airbnb/lottie/model/content/f;->l:Lcom/airbnb/lottie/model/animatable/b;

    .line 27
    .line 28
    iput-boolean p13, p0, Lcom/airbnb/lottie/model/content/f;->m:Z

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public a(Lcom/airbnb/lottie/x0;Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/model/layer/b;)Lcom/airbnb/lottie/animation/content/c;
    .locals 0

    new-instance p2, Lcom/airbnb/lottie/animation/content/i;

    invoke-direct {p2, p1, p3, p0}, Lcom/airbnb/lottie/animation/content/i;-><init>(Lcom/airbnb/lottie/x0;Lcom/airbnb/lottie/model/layer/b;Lcom/airbnb/lottie/model/content/f;)V

    return-object p2
.end method

.method public b()Lcom/airbnb/lottie/model/content/s$b;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->h:Lcom/airbnb/lottie/model/content/s$b;

    return-object v0
.end method

.method public c()Lcom/airbnb/lottie/model/animatable/b;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->l:Lcom/airbnb/lottie/model/animatable/b;

    return-object v0
.end method

.method public d()Lcom/airbnb/lottie/model/animatable/f;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->f:Lcom/airbnb/lottie/model/animatable/f;

    return-object v0
.end method

.method public e()Lcom/airbnb/lottie/model/animatable/c;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->c:Lcom/airbnb/lottie/model/animatable/c;

    return-object v0
.end method

.method public f()Lcom/airbnb/lottie/model/content/g;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->b:Lcom/airbnb/lottie/model/content/g;

    return-object v0
.end method

.method public g()Lcom/airbnb/lottie/model/content/s$c;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->i:Lcom/airbnb/lottie/model/content/s$c;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/animatable/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->k:Ljava/util/List;

    return-object v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/model/content/f;->j:F

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public k()Lcom/airbnb/lottie/model/animatable/d;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->d:Lcom/airbnb/lottie/model/animatable/d;

    return-object v0
.end method

.method public l()Lcom/airbnb/lottie/model/animatable/f;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->e:Lcom/airbnb/lottie/model/animatable/f;

    return-object v0
.end method

.method public m()Lcom/airbnb/lottie/model/animatable/b;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/content/f;->g:Lcom/airbnb/lottie/model/animatable/b;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/airbnb/lottie/model/content/f;->m:Z

    return v0
.end method
