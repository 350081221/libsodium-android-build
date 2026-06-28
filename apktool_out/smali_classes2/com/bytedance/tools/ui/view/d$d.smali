.class Lcom/bytedance/tools/ui/view/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/view/d;->i(Landroid/widget/BaseAdapter;Landroid/widget/AdapterView$OnItemClickListener;Landroid/view/View$OnClickListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View$OnClickListener;

.field final synthetic b:Landroid/app/Dialog;

.field final synthetic c:Lcom/bytedance/tools/ui/view/d;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/view/d;Landroid/view/View$OnClickListener;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/view/d$d;->c:Lcom/bytedance/tools/ui/view/d;

    iput-object p2, p0, Lcom/bytedance/tools/ui/view/d$d;->a:Landroid/view/View$OnClickListener;

    iput-object p3, p0, Lcom/bytedance/tools/ui/view/d$d;->b:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/d$d;->a:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Lcom/bytedance/tools/ui/view/d$d;->b:Landroid/app/Dialog;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method
