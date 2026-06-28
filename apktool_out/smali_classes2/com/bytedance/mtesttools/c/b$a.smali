.class Lcom/bytedance/mtesttools/c/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/c/b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/c/b;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/c/b;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/c/b$a;->a:Lcom/bytedance/mtesttools/c/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 0

    .line 1
    sget p1, Lcom/bytedance/tools/R$id;->z2:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/bytedance/mtesttools/c/b$a;->a:Lcom/bytedance/mtesttools/c/b;

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    iput p2, p1, Lcom/bytedance/mtesttools/c/b;->f:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget p1, Lcom/bytedance/tools/R$id;->v2:I

    .line 12
    .line 13
    if-ne p2, p1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/bytedance/mtesttools/c/b$a;->a:Lcom/bytedance/mtesttools/c/b;

    .line 16
    .line 17
    const/4 p2, 0x1

    .line 18
    iput p2, p1, Lcom/bytedance/mtesttools/c/b;->f:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget p1, Lcom/bytedance/tools/R$id;->w2:I

    .line 22
    .line 23
    if-ne p2, p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/bytedance/mtesttools/c/b$a;->a:Lcom/bytedance/mtesttools/c/b;

    .line 26
    .line 27
    const/4 p2, 0x3

    .line 28
    iput p2, p1, Lcom/bytedance/mtesttools/c/b;->f:I

    .line 29
    .line 30
    :cond_2
    :goto_0
    return-void
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
.end method
