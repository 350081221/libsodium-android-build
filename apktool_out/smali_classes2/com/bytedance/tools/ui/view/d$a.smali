.class Lcom/bytedance/tools/ui/view/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/view/d;->b(Landroid/widget/RadioGroup;Lcom/bytedance/tools/c/b;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/bytedance/tools/ui/view/d;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/view/d;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/view/d$a;->b:Lcom/bytedance/tools/ui/view/d;

    iput-object p2, p0, Lcom/bytedance/tools/ui/view/d$a;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance p1, Lcom/bytedance/tools/ui/a/a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/d$a;->b:Lcom/bytedance/tools/ui/view/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/bytedance/tools/ui/view/d$a;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {p1, v0, v1}, Lcom/bytedance/tools/ui/a/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/d$a;->b:Lcom/bytedance/tools/ui/view/d;

    .line 15
    .line 16
    new-instance v1, Lcom/bytedance/tools/ui/view/d$a$a;

    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, Lcom/bytedance/tools/ui/view/d$a$a;-><init>(Lcom/bytedance/tools/ui/view/d$a;Lcom/bytedance/tools/ui/a/a;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lcom/bytedance/tools/ui/view/d$a$b;

    .line 22
    .line 23
    invoke-direct {v2, p0, p1}, Lcom/bytedance/tools/ui/view/d$a$b;-><init>(Lcom/bytedance/tools/ui/view/d$a;Lcom/bytedance/tools/ui/a/a;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, p1, v1, v2}, Lcom/bytedance/tools/ui/view/d;->j(Lcom/bytedance/tools/ui/view/d;Landroid/widget/BaseAdapter;Landroid/widget/AdapterView$OnItemClickListener;Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
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
