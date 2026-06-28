.class Lorg/osmdroid/tileprovider/cachemanager/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/tileprovider/cachemanager/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/tileprovider/cachemanager/a;->y(Landroid/content/Context;)Lorg/osmdroid/tileprovider/cachemanager/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lorg/osmdroid/tileprovider/cachemanager/a;


# direct methods
.method constructor <init>(Lorg/osmdroid/tileprovider/cachemanager/a;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lorg/osmdroid/tileprovider/cachemanager/a$c;->b:Lorg/osmdroid/tileprovider/cachemanager/a;

    iput-object p2, p0, Lorg/osmdroid/tileprovider/cachemanager/a$c;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public b(J)Z
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a$c;->b:Lorg/osmdroid/tileprovider/cachemanager/a;

    iget-object v1, v0, Lorg/osmdroid/tileprovider/cachemanager/a;->b:Lorg/osmdroid/tileprovider/tilesource/e;

    check-cast v1, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    invoke-virtual {v0, v1, p1, p2}, Lorg/osmdroid/tileprovider/cachemanager/a;->L(Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public c()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a$c;->b:Lorg/osmdroid/tileprovider/cachemanager/a;

    .line 2
    .line 3
    iget-object v0, v0, Lorg/osmdroid/tileprovider/cachemanager/a;->b:Lorg/osmdroid/tileprovider/tilesource/e;

    .line 4
    .line 5
    instance-of v1, v0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast v0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->getTileSourcePolicy()Lorg/osmdroid/tileprovider/tilesource/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/tilesource/j;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    new-instance v0, Lorg/osmdroid/tileprovider/tilesource/k;

    .line 24
    .line 25
    iget-object v1, p0, Lorg/osmdroid/tileprovider/cachemanager/a$c;->a:Landroid/content/Context;

    .line 26
    .line 27
    sget v2, Lorg/osmdroid/library/R$string;->n:I

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Lorg/osmdroid/tileprovider/tilesource/k;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    const-string v0, "OsmDroid"

    .line 38
    .line 39
    const-string v1, "TileSource is not an online tile source"

    .line 40
    .line 41
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    return v0
.end method
