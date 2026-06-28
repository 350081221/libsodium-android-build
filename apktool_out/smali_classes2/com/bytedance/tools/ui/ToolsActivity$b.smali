.class Lcom/bytedance/tools/ui/ToolsActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/ToolsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/viewpager/widget/ViewPager;

.field final synthetic b:I

.field final synthetic c:Lcom/bytedance/tools/ui/ToolsActivity;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/ToolsActivity;Landroidx/viewpager/widget/ViewPager;I)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity$b;->c:Lcom/bytedance/tools/ui/ToolsActivity;

    iput-object p2, p0, Lcom/bytedance/tools/ui/ToolsActivity$b;->a:Landroidx/viewpager/widget/ViewPager;

    iput p3, p0, Lcom/bytedance/tools/ui/ToolsActivity$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity$b;->a:Landroidx/viewpager/widget/ViewPager;

    iget v0, p0, Lcom/bytedance/tools/ui/ToolsActivity$b;->b:I

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method
