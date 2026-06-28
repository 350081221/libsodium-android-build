.class Lorg/osmdroid/views/overlay/TilesOverlay$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/views/drawing/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/views/overlay/TilesOverlay;->onOptionsItemSelected(Landroid/view/MenuItem;ILorg/osmdroid/views/MapView;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/osmdroid/views/overlay/TilesOverlay;


# direct methods
.method constructor <init>(Lorg/osmdroid/views/overlay/TilesOverlay;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay$1;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public callback(Lorg/osmdroid/views/drawing/a;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/views/drawing/a;->c()Lorg/osmdroid/views/drawing/a$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lorg/osmdroid/views/drawing/a$b;->CANVAS_OK:Lorg/osmdroid/views/drawing/a$b;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Lorg/osmdroid/config/c;->u()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "snapshot.png"

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lorg/osmdroid/views/drawing/a;->m(Ljava/io/File;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lorg/osmdroid/views/drawing/a;->e()V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method
