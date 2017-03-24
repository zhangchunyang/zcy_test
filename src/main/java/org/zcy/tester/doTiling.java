package org.zcy.tester;

import java.io.File;
import java.util.Arrays;

import ar.com.hjg.pngj.ImageInfo;
import ar.com.hjg.pngj.PngReader;
import ar.com.hjg.pngj.PngWriter;
import ar.com.hjg.pngj.chunks.ChunkCopyBehaviour;

public class doTiling {

	/**
	 * Tiles a set of png images (identical sizes and color models)
	 * 
	 * @param tiles
	 *            Filenames of PNG files to tile
	 * @param dest
	 *            Destination PNG filename
	 * @param nTilesX
	 *            How many tiles per row?
	 */
//	public static void doTiling(String tiles[], String dest, int nTilesX) {
//		int ntiles = tiles.length;
//		int nTilesY = (ntiles + nTilesX - 1) / nTilesX; // integer ceil
//		ImageInfo imi1, imi2; // 1:small tile 2:big image
//		PngReader pngr = FileHelper.createPngReader(new File(tiles[0]));
//		imi1 = pngr.imgInfo;
//		PngReader[] readers = new PngReader[nTilesX];
//		imi2 = new ImageInfo(imi1.cols * nTilesX, imi1.rows * nTilesY,
//				imi1.bitDepth, imi1.alpha, imi1.greyscale, imi1.indexed);
//		PngWriter pngw = FileHelper.createPngWriter(new File(dest), imi2, true);
//		// copy palette and transparency if necessary (more chunks?)
//		pngw.copyChunksFirst(pngr, ChunkCopyBehaviour.COPY_PALETTE
//				| ChunkCopyBehaviour.COPY_TRANSPARENCY);
//		pngr.end(); // close, we'll reopen it again soon
//		ImageLine line2 = new ImageLine(imi2, ImageLine.SampleType.INT, false);
//		int row2 = 0;
//		for (int ty = 0; ty < nTilesY; ty++) {
//			int nTilesXcur = ty < nTilesY - 1 ? nTilesX : ntiles
//					- (nTilesY - 1) * nTilesX;
//			Arrays.fill(line2.scanline, 0);
//			for (int tx = 0; tx < nTilesXcur; tx++) { // open serveral readers
//				readers[tx] = FileHelper.createPngReader(new File(tiles[tx + ty
//						* nTilesX]));
//				readers[tx]
//						.setChunkLoadBehaviour(ChunkLoadBehaviour.LOAD_CHUNK_NEVER);
//				readers[tx].setUnpackedMode(false);
//				if (!readers[tx].imgInfo.equals(imi1))
//					throw new RuntimeException("different tile ? "
//							+ readers[tx].imgInfo);
//			}
//			for (int row1 = 0; row1 < imi1.rows; row1++, row2++) {
//				for (int tx = 0; tx < nTilesXcur; tx++) {
//					ImageLine line1 = readers[tx].readRowInt(row1); // read line
//					System.arraycopy(line1.scanline, 0, line2.scanline,
//							line1.scanline.length * tx, line1.scanline.length);
//				}
//				pngw.writeRow(line2, row2); // write to full image
//			}
//			for (int tx = 0; tx < nTilesXcur; tx++)
//				readers[tx].end(); // close readers
//		}
//		pngw.end(); // close writer
//	}
//
//	public static void main(String[] args) {
//		doTiling(new String[] { "t1.png", "t2.png", "t3.png", "t4.png",
//				"t5.png", "t6.png" }, "tiled.png", 2);
//		System.out.println("done");
//	}
}
