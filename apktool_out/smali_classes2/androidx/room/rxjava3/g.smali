.class public final synthetic Landroidx/room/rxjava3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/l0;


# instance fields
.field public final synthetic a:[Ljava/lang/String;

.field public final synthetic b:Landroidx/room/RoomDatabase;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;Landroidx/room/RoomDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/rxjava3/g;->a:[Ljava/lang/String;

    iput-object p2, p0, Landroidx/room/rxjava3/g;->b:Landroidx/room/RoomDatabase;

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/rxjava3/core/k0;)V
    .locals 2

    iget-object v0, p0, Landroidx/room/rxjava3/g;->a:[Ljava/lang/String;

    iget-object v1, p0, Landroidx/room/rxjava3/g;->b:Landroidx/room/RoomDatabase;

    invoke-static {v0, v1, p1}, Landroidx/room/rxjava3/RxRoom;->e([Ljava/lang/String;Landroidx/room/RoomDatabase;Lio/reactivex/rxjava3/core/k0;)V

    return-void
.end method
