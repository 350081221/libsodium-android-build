.class public final synthetic Lcom/yuanqi/group/widgets/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/widgets/CardStackLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/widgets/CardStackLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/widgets/g;->a:Lcom/yuanqi/group/widgets/CardStackLayout;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/g;->a:Lcom/yuanqi/group/widgets/CardStackLayout;

    invoke-virtual {v0}, Lcom/yuanqi/group/widgets/CardStackLayout;->g()V

    return-void
.end method
