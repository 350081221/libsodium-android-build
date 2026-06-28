.class public final synthetic Landroidx/room/rxjava3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/o;


# instance fields
.field public final synthetic a:Lio/reactivex/rxjava3/core/x;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/rxjava3/core/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/rxjava3/b;->a:Lio/reactivex/rxjava3/core/x;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/room/rxjava3/b;->a:Lio/reactivex/rxjava3/core/x;

    invoke-static {v0, p1}, Landroidx/room/rxjava3/RxRoom;->f(Lio/reactivex/rxjava3/core/x;Ljava/lang/Object;)Lio/reactivex/rxjava3/core/d0;

    move-result-object p1

    return-object p1
.end method
