.class public final synthetic Landroidx/room/rxjava3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/a;


# instance fields
.field public final synthetic a:Landroidx/room/RoomDatabase;

.field public final synthetic b:Landroidx/room/InvalidationTracker$Observer;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/rxjava3/a;->a:Landroidx/room/RoomDatabase;

    iput-object p2, p0, Landroidx/room/rxjava3/a;->b:Landroidx/room/InvalidationTracker$Observer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/room/rxjava3/a;->a:Landroidx/room/RoomDatabase;

    iget-object v1, p0, Landroidx/room/rxjava3/a;->b:Landroidx/room/InvalidationTracker$Observer;

    invoke-static {v0, v1}, Landroidx/room/rxjava3/RxRoom;->c(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V

    return-void
.end method
