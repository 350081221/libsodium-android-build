.class public final synthetic Lcom/yuanqi/group/home/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/models/AppInfoLite;

.field public final synthetic b:Lcom/yuanqi/group/home/k0;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/models/AppInfoLite;Lcom/yuanqi/group/home/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/s;->a:Lcom/yuanqi/group/home/models/AppInfoLite;

    iput-object p2, p0, Lcom/yuanqi/group/home/s;->b:Lcom/yuanqi/group/home/k0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/group/home/s;->a:Lcom/yuanqi/group/home/models/AppInfoLite;

    iget-object v1, p0, Lcom/yuanqi/group/home/s;->b:Lcom/yuanqi/group/home/k0;

    invoke-static {v0, v1}, Lcom/yuanqi/group/home/k0;->o(Lcom/yuanqi/group/home/models/AppInfoLite;Lcom/yuanqi/group/home/k0;)V

    return-void
.end method
