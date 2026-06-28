.class public final synthetic Lcom/yuanqi/group/home/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/g;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/yuanqi/group/home/k0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/yuanqi/group/home/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/j0;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/yuanqi/group/home/j0;->b:Lcom/yuanqi/group/home/k0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/group/home/j0;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/yuanqi/group/home/j0;->b:Lcom/yuanqi/group/home/k0;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/group/home/k0;->y(Ljava/util/List;Lcom/yuanqi/group/home/k0;Ljava/lang/Void;)V

    return-void
.end method
