.class public final synthetic Lcom/yuanqi/master/tools/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/k;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/k;->a:Landroid/view/View;

    invoke-static {v0, p1}, Lcom/yuanqi/master/tools/o0;->c(Landroid/view/View;Landroid/content/DialogInterface;)V

    return-void
.end method
