.class public Lcom/lody/virtual/helper/dedex/Vdex$QuickenDex;
.super Lcom/lody/virtual/helper/dedex/Dex;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Vdex;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "QuickenDex"
.end annotation


# direct methods
.method constructor <init>(Lcom/lody/virtual/helper/dedex/DataReader;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/lody/virtual/helper/dedex/Dex;-><init>(Lcom/lody/virtual/helper/dedex/DataReader;)V

    return-void
.end method
