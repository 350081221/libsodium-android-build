.class public final synthetic Lcom/yuanqi/master/main/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/yuanqi/group/home/models/b;

    check-cast p2, Lcom/yuanqi/group/home/models/b;

    invoke-static {p1, p2}, Lcom/yuanqi/master/main/MainViewModel;->f(Lcom/yuanqi/group/home/models/b;Lcom/yuanqi/group/home/models/b;)I

    move-result p1

    return p1
.end method
