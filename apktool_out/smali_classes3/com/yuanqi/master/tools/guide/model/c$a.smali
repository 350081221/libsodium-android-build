.class public Lcom/yuanqi/master/tools/guide/model/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/master/tools/guide/model/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/yuanqi/master/tools/guide/model/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/yuanqi/master/tools/guide/model/c;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/yuanqi/master/tools/guide/model/c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/yuanqi/master/tools/guide/model/c$a;->a:Lcom/yuanqi/master/tools/guide/model/c;

    .line 10
    .line 11
    return-void
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
.method public a()Lcom/yuanqi/master/tools/guide/model/c;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/c$a;->a:Lcom/yuanqi/master/tools/guide/model/c;

    return-object v0
.end method

.method public b(Z)Lcom/yuanqi/master/tools/guide/model/c$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/c$a;->a:Lcom/yuanqi/master/tools/guide/model/c;

    iput-boolean p1, v0, Lcom/yuanqi/master/tools/guide/model/c;->d:Z

    return-object p0
.end method

.method public c(Landroid/view/View$OnClickListener;)Lcom/yuanqi/master/tools/guide/model/c$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/c$a;->a:Lcom/yuanqi/master/tools/guide/model/c;

    iput-object p1, v0, Lcom/yuanqi/master/tools/guide/model/c;->a:Landroid/view/View$OnClickListener;

    return-object p0
.end method

.method public d(Ly2/c;)Lcom/yuanqi/master/tools/guide/model/c$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/c$a;->a:Lcom/yuanqi/master/tools/guide/model/c;

    iput-object p1, v0, Lcom/yuanqi/master/tools/guide/model/c;->c:Ly2/c;

    return-object p0
.end method

.method public e(Lcom/yuanqi/master/tools/guide/model/f;)Lcom/yuanqi/master/tools/guide/model/c$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/c$a;->a:Lcom/yuanqi/master/tools/guide/model/c;

    iput-object p1, v0, Lcom/yuanqi/master/tools/guide/model/c;->b:Lcom/yuanqi/master/tools/guide/model/f;

    return-object p0
.end method
