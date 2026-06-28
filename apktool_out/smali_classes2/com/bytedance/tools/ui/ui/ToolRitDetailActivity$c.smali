.class Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$c;->a:Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 1
    const/4 p1, -0x1

    .line 2
    if-ne p2, p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$c;->a:Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->H(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;)Landroid/widget/Button;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$c;->a:Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->H(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;)Landroid/widget/Button;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$c;->a:Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;

    .line 26
    .line 27
    invoke-static {p1, p2}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->G(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;I)I

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$c;->a:Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;

    .line 31
    .line 32
    invoke-static {p1, p2}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->F(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;I)V

    .line 33
    .line 34
    .line 35
    return-void
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
