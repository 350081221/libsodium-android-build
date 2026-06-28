.class Lcom/yuanqi/master/database/dao/d$d;
.super Landroidx/room/SharedSQLiteStatement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/database/dao/d;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/master/database/dao/d;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/database/dao/d;Landroidx/room/RoomDatabase;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/database/dao/d$d;->a:Lcom/yuanqi/master/database/dao/d;

    invoke-direct {p0, p2}, Landroidx/room/SharedSQLiteStatement;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public createQuery()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "DELETE from AppNote where package_name=? and user_id=?"

    return-object v0
.end method
