.class public Lcom/bytedance/mtesttools/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, -0x270f

    const-string v1, "load\u5931\u8d25\uff0c\u5e7f\u544a\u4e3a\u7a7a"

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 2

    const/16 v0, -0x270f

    const-string v1, "load\u5931\u8d25"

    .line 2
    invoke-direct {p0, v0, v1, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/bytedance/mtesttools/b/a;->a:I

    .line 5
    iput-object p2, p0, Lcom/bytedance/mtesttools/b/a;->b:Ljava/lang/String;

    .line 6
    iput p3, p0, Lcom/bytedance/mtesttools/b/a;->c:I

    .line 7
    iput-object p4, p0, Lcom/bytedance/mtesttools/b/a;->d:Ljava/lang/String;

    return-void
.end method
