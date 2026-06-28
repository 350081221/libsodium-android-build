.class public final synthetic Lcom/yuanqi/master/addapp/home/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/m;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/m;->a:Ljava/lang/String;

    check-cast p1, Lcom/yuanqi/group/home/models/c;

    check-cast p2, Lcom/yuanqi/group/home/models/c;

    invoke-static {v0, p1, p2}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;->a(Ljava/lang/String;Lcom/yuanqi/group/home/models/c;Lcom/yuanqi/group/home/models/c;)I

    move-result p1

    return p1
.end method
