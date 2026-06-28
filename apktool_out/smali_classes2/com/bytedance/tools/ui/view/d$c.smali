.class Lcom/bytedance/tools/ui/view/d$c;
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
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/bytedance/tools/ui/view/d;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/view/d;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/view/d$c;->b:Lcom/bytedance/tools/ui/view/d;

    iput-object p2, p0, Lcom/bytedance/tools/ui/view/d$c;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/bytedance/tools/ui/view/d$c;->a:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
