.class public final synthetic Lcom/yuanqi/master/tools/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/s0;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/s0;Landroid/content/Context;Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/g;->a:Lkotlinx/coroutines/s0;

    iput-object p2, p0, Lcom/yuanqi/master/tools/g;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/yuanqi/master/tools/g;->c:Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/tools/g;->a:Lkotlinx/coroutines/s0;

    iget-object v1, p0, Lcom/yuanqi/master/tools/g;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/yuanqi/master/tools/g;->c:Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;

    invoke-static {v0, v1, v2, p1}, Lcom/yuanqi/master/tools/o0;->B(Lkotlinx/coroutines/s0;Landroid/content/Context;Lcom/yqtech/multiapp/databinding/DialogSetPwdBinding;Landroid/content/DialogInterface;)V

    return-void
.end method
