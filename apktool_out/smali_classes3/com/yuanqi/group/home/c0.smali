.class public final synthetic Lcom/yuanqi/group/home/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/j;


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Lcom/yuanqi/group/home/k0;

.field public final synthetic c:Lcom/yuanqi/group/home/models/AppInfoLite;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Lcom/yuanqi/group/home/k0;Lcom/yuanqi/group/home/models/AppInfoLite;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/c0;->a:Landroid/app/Dialog;

    iput-object p2, p0, Lcom/yuanqi/group/home/c0;->b:Lcom/yuanqi/group/home/k0;

    iput-object p3, p0, Lcom/yuanqi/group/home/c0;->c:Lcom/yuanqi/group/home/models/AppInfoLite;

    return-void
.end method


# virtual methods
.method public final onFail(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/c0;->a:Landroid/app/Dialog;

    iget-object v1, p0, Lcom/yuanqi/group/home/c0;->b:Lcom/yuanqi/group/home/k0;

    iget-object v2, p0, Lcom/yuanqi/group/home/c0;->c:Lcom/yuanqi/group/home/models/AppInfoLite;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1}, Lcom/yuanqi/group/home/k0;->B(Landroid/app/Dialog;Lcom/yuanqi/group/home/k0;Lcom/yuanqi/group/home/models/AppInfoLite;Ljava/lang/Throwable;)V

    return-void
.end method
