.class public Lcom/yuanqi/group/widgets/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:I = 0x1111

.field public static final g:I = 0x1

.field public static final h:I = 0x10

.field public static final i:I = 0x100

.field public static final j:I = 0x1000


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1111

    .line 5
    .line 6
    iput v0, p0, Lcom/yuanqi/group/widgets/j;->e:I

    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/j;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/j;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/j;->d:I

    return v0
.end method

.method public d()I
    .locals 1

    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/j;->e()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public e()I
    .locals 2

    iget v0, p0, Lcom/yuanqi/group/widgets/j;->b:I

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/yuanqi/group/widgets/j;->c:I

    iget v1, p0, Lcom/yuanqi/group/widgets/j;->d:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, Lcom/yuanqi/group/widgets/j;->b:I

    add-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/j;->b:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/j;->e:I

    return v0
.end method

.method public h(I)Lcom/yuanqi/group/widgets/j;
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/j;->a:I

    return-object p0
.end method

.method public i(I)Lcom/yuanqi/group/widgets/j;
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/j;->c:I

    return-object p0
.end method

.method public j(I)Lcom/yuanqi/group/widgets/j;
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/j;->d:I

    return-object p0
.end method

.method public k(I)Lcom/yuanqi/group/widgets/j;
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/j;->b:I

    return-object p0
.end method

.method public l(I)Lcom/yuanqi/group/widgets/j;
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/j;->e:I

    return-object p0
.end method
