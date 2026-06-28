.class public final synthetic Lcom/yuanqi/group/home/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/q;->a:Lcom/yuanqi/group/home/HomeActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/q;->a:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {v0}, Lcom/yuanqi/group/home/HomeActivity$m;->a(Lcom/yuanqi/group/home/HomeActivity;)V

    return-void
.end method
