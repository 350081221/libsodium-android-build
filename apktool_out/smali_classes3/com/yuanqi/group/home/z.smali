.class public final synthetic Lcom/yuanqi/group/home/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/j;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/k0;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/z;->a:Lcom/yuanqi/group/home/k0;

    return-void
.end method


# virtual methods
.method public final onFail(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/z;->a:Lcom/yuanqi/group/home/k0;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/yuanqi/group/home/k0;->s(Lcom/yuanqi/group/home/k0;Ljava/lang/Throwable;)V

    return-void
.end method
