.class public final synthetic Lcom/yuanqi/master/manager/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/manager/ManagerViewModel;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/manager/f;->a:Lcom/yuanqi/master/manager/ManagerViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/manager/f;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/manager/f;->a:Lcom/yuanqi/master/manager/ManagerViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/manager/f;->b:Landroid/content/Context;

    invoke-static {v0, v1, p1, p2}, Lcom/yuanqi/master/manager/ManagerViewModel;->d(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;Landroid/content/DialogInterface;I)V

    return-void
.end method
