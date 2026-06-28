.class Lcom/bytedance/tools/ui/view/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/view/d$a;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/tools/ui/a/a;

.field final synthetic b:Lcom/bytedance/tools/ui/view/d$a;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/view/d$a;Lcom/bytedance/tools/ui/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/view/d$a$a;->b:Lcom/bytedance/tools/ui/view/d$a;

    iput-object p2, p0, Lcom/bytedance/tools/ui/view/d$a$a;->a:Lcom/bytedance/tools/ui/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/bytedance/tools/ui/view/d$a$a;->a:Lcom/bytedance/tools/ui/a/a;

    invoke-virtual {p1, p3}, Lcom/bytedance/tools/ui/a/a;->b(I)V

    return-void
.end method
