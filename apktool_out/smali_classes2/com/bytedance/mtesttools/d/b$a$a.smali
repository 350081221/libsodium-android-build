.class Lcom/bytedance/mtesttools/d/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/d/b$a;->a(ILj1/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj1/f;

.field final synthetic b:Lcom/bytedance/mtesttools/d/b$a;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/d/b$a;Lj1/f;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/d/b$a$a;->b:Lcom/bytedance/mtesttools/d/b$a;

    iput-object p2, p0, Lcom/bytedance/mtesttools/d/b$a$a;->a:Lj1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/content/Intent;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/b$a$a;->b:Lcom/bytedance/mtesttools/d/b$a;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/bytedance/mtesttools/d/b$a;->f:Lcom/bytedance/mtesttools/d/b;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/bytedance/mtesttools/d/b;->b(Lcom/bytedance/mtesttools/d/b;)Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v0, "water_fall_config"

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/bytedance/mtesttools/d/b$a$a;->a:Lj1/f;

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/b$a$a;->b:Lcom/bytedance/mtesttools/d/b$a;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/bytedance/mtesttools/d/b$a;->f:Lcom/bytedance/mtesttools/d/b;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/bytedance/mtesttools/d/b;->b(Lcom/bytedance/mtesttools/d/b;)Landroid/app/Activity;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/16 v1, 0x16

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 35
    .line 36
    .line 37
    return-void
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
