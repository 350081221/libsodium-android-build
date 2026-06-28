.class Lcom/bytedance/mtesttools/d/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/d/c$a;->a(ILj1/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj1/d;

.field final synthetic b:Lcom/bytedance/mtesttools/d/c$a;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/d/c$a;Lj1/d;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/d/c$a$a;->b:Lcom/bytedance/mtesttools/d/c$a;

    iput-object p2, p0, Lcom/bytedance/mtesttools/d/c$a$a;->a:Lj1/d;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/c$a$a;->b:Lcom/bytedance/mtesttools/d/c$a;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/bytedance/mtesttools/d/c$a;->g:Lcom/bytedance/mtesttools/d/c;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/bytedance/mtesttools/d/c;->a(Lcom/bytedance/mtesttools/d/c;)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lcom/bytedance/mtesttools/act/AdnDetailActivity;

    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "adn_config"

    .line 17
    .line 18
    iget-object v1, p0, Lcom/bytedance/mtesttools/d/c$a$a;->a:Lj1/d;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/c$a$a;->b:Lcom/bytedance/mtesttools/d/c$a;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/bytedance/mtesttools/d/c$a;->g:Lcom/bytedance/mtesttools/d/c;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/bytedance/mtesttools/d/c;->a(Lcom/bytedance/mtesttools/d/c;)Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 32
    .line 33
    .line 34
    return-void
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
