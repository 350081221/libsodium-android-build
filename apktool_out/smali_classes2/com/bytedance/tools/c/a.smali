.class public Lcom/bytedance/tools/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/tools/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Z

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/bytedance/tools/c/a;->c:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/bytedance/tools/c/a;->e:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/bytedance/tools/c/a;->f:Z

    .line 10
    .line 11
    iput v0, p0, Lcom/bytedance/tools/c/a;->g:I

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lcom/bytedance/tools/c/a;->h:I

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/bytedance/tools/c/a;->c:I

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/bytedance/tools/c/a;->c:I

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/c/a;->a:Ljava/lang/String;

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/tools/c/a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bytedance/tools/c/a;->d:Ljava/util/List;

    return-void
.end method

.method public e(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/tools/c/a;->e:Z

    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/tools/c/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Lcom/bytedance/tools/c/a;->g:I

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/c/a;->b:Ljava/lang/String;

    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/tools/c/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public j(I)V
    .locals 0

    iput p1, p0, Lcom/bytedance/tools/c/a;->h:I

    return-void
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/tools/c/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bytedance/tools/c/a;->d:Ljava/util/List;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/tools/c/a;->e:Z

    return v0
.end method

.method public m()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bytedance/tools/c/a;->f:Z

    return-void
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/tools/c/a;->f:Z

    return v0
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lcom/bytedance/tools/c/a;->g:I

    return v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lcom/bytedance/tools/c/a;->h:I

    return v0
.end method
