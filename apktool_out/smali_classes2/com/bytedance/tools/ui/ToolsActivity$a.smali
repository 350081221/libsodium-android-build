.class Lcom/bytedance/tools/ui/ToolsActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/ToolsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/tools/ui/ToolsActivity;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/ToolsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity$a;->a:Lcom/bytedance/tools/ui/ToolsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    iget-object v0, p0, Lcom/bytedance/tools/ui/ToolsActivity$a;->a:Lcom/bytedance/tools/ui/ToolsActivity;

    invoke-static {v0, p1}, Lcom/bytedance/tools/ui/ToolsActivity;->D(Lcom/bytedance/tools/ui/ToolsActivity;I)V

    return-void
.end method
