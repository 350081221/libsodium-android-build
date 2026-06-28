.class public final synthetic Lcom/yuanqi/group/home/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lcom/yuanqi/group/home/k0;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/View;Lcom/yuanqi/group/home/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/u;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/yuanqi/group/home/u;->b:Landroid/view/View;

    iput-object p3, p0, Lcom/yuanqi/group/home/u;->c:Lcom/yuanqi/group/home/k0;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/u;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/yuanqi/group/home/u;->b:Landroid/view/View;

    iget-object v2, p0, Lcom/yuanqi/group/home/u;->c:Lcom/yuanqi/group/home/k0;

    invoke-static {v0, v1, v2}, Lcom/yuanqi/group/home/k0;->u(Landroid/view/View;Landroid/view/View;Lcom/yuanqi/group/home/k0;)V

    return-void
.end method
