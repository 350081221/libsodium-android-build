.class Lorg/osmdroid/views/overlay/DefaultOverlayManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/views/overlay/DefaultOverlayManager;->overlaysReversed()Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lorg/osmdroid/views/overlay/Overlay;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/osmdroid/views/overlay/DefaultOverlayManager;


# direct methods
.method constructor <init>(Lorg/osmdroid/views/overlay/DefaultOverlayManager;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/DefaultOverlayManager$1;->this$0:Lorg/osmdroid/views/overlay/DefaultOverlayManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private bulletProofReverseListIterator()Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "Lorg/osmdroid/views/overlay/Overlay;",
            ">;"
        }
    .end annotation

    :catch_0
    :try_start_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/DefaultOverlayManager$1;->this$0:Lorg/osmdroid/views/overlay/DefaultOverlayManager;

    invoke-static {v0}, Lorg/osmdroid/views/overlay/DefaultOverlayManager;->access$000(Lorg/osmdroid/views/overlay/DefaultOverlayManager;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    iget-object v1, p0, Lorg/osmdroid/views/overlay/DefaultOverlayManager$1;->this$0:Lorg/osmdroid/views/overlay/DefaultOverlayManager;

    invoke-static {v1}, Lorg/osmdroid/views/overlay/DefaultOverlayManager;->access$000(Lorg/osmdroid/views/overlay/DefaultOverlayManager;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/osmdroid/views/overlay/Overlay;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/DefaultOverlayManager$1;->bulletProofReverseListIterator()Ljava/util/ListIterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lorg/osmdroid/views/overlay/DefaultOverlayManager$1$1;

    .line 6
    .line 7
    invoke-direct {v1, p0, v0}, Lorg/osmdroid/views/overlay/DefaultOverlayManager$1$1;-><init>(Lorg/osmdroid/views/overlay/DefaultOverlayManager$1;Ljava/util/ListIterator;)V

    .line 8
    .line 9
    .line 10
    return-object v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method
