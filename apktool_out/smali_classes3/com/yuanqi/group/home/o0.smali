.class public final synthetic Lcom/yuanqi/group/home/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/PermissionRequestActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/PermissionRequestActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/o0;->a:Lcom/yuanqi/group/home/PermissionRequestActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/o0;->a:Lcom/yuanqi/group/home/PermissionRequestActivity;

    invoke-static {v0}, Lcom/yuanqi/group/home/PermissionRequestActivity;->a(Lcom/yuanqi/group/home/PermissionRequestActivity;)V

    return-void
.end method
